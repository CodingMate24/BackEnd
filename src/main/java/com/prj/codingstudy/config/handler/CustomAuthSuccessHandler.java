package com.prj.codingstudy.config.handler;

import com.prj.codingstudy.core.domain.auth.AuthAccessLog;
import com.prj.codingstudy.core.domain.auth.AuthRefreshToken;
import com.prj.codingstudy.core.mapper.AuthAccessLogMapper;
import com.prj.codingstudy.core.service.auth.AuthAccessLogService;
import com.prj.codingstudy.utils.IpUtils;
import com.prj.codingstudy.utils.TokenUtils;
import com.prj.codingstudy.config.model.UserDetailsDto;
import com.prj.codingstudy.config.model.UserDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 사용자의 '인증'에 대해 성공하였을때, 수행하여 사용자에게 사용자 정보 및 JWT에 대한 응답 값을 제공해주는 Handler입니다.
 *
 * @author : jonghoon
 * @fileName : CustomAuthenticationFilter
 * @since : 10/1/24
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class CustomAuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final AuthAccessLogService authAccessLogService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException {
        log.debug("3.1. CustomLoginSuccessHandler");

        // [STEP1] 사용자와 관련된 정보를 모두 조회합니다.
        UserDto userDto = ((UserDetailsDto) authentication.getPrincipal()).getUserDto();

        // [STEP2] 응답 데이터를 구성합니다.
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("userInfo", userDto);

        // [STEP3] 사용자의 상태에 따라 응답 데이터를 설정합니다.
        if ("Y".equals(userDto.getDelYn())) {
            responseMap.put("resultCode", 9001);
            responseMap.put("token", null);
            responseMap.put("failMsg", "휴면 계정입니다.");
        } else {
            responseMap.put("resultCode", 200);
            responseMap.put("failMsg", null);
            String accessToken = TokenUtils.generateJwt(userDto);

            Date refreshExpiredTime = TokenUtils.createExpiredDate(false);
            String refreshToken = TokenUtils.generateRefreshToken(userDto, refreshExpiredTime);

            // [STEP3-1] 사용자의 Refresh Token 을 적재한다.
            AuthRefreshToken authRefreshToken = AuthRefreshToken.builder()
                    .mbrId(userDto.getMbrId())
                    .expiredDt(refreshExpiredTime)
                    .mbrRefreshToken(refreshToken)
                    .expiredYn("N")
                    .build();

            authAccessLogService.insertRefreshToken(authRefreshToken);

            log.debug("생성된 토큰(접근 토큰) :: {}", accessToken);
            log.debug("생성된 토큰(리프레시 토큰) :: {}", refreshToken);
            responseMap.put("accessToken", accessToken);
            responseMap.put("refreshToken", refreshToken);
            response.addHeader("Authorization", "BEARER " + accessToken);
        }

        // [STEP3-2] 사용자의 Access Log 를 적재한다.
        AuthAccessLog authAccessLog = AuthAccessLog.builder()
                .accessType("A")
                .accessUrl("/api/login")
                .accessUrlNm("회원 로그인 API")
                .accessParam(request.getParameter("mbrEmail"))
                .accessIp(IpUtils.getClientIp(request))
                .build();

        authAccessLogService.insertAccessLog(authAccessLog);


        // [STEP4] 구성한 응답 값을 JSON 형태로 전달합니다.
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter printWriter = response.getWriter();
        printWriter.write(objectMapper.writeValueAsString(responseMap));
        printWriter.flush();
        printWriter.close();
    }
}