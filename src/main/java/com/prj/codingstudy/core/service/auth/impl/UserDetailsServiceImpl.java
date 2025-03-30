package com.prj.codingstudy.core.service.auth.impl;

import com.prj.codingstudy.config.model.UserDetailsDto;
import com.prj.codingstudy.config.model.UserDto;
import com.prj.codingstudy.core.service.auth.UserService;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * UserDetailsService 구현체
 * 사용자 인증 정보를 로드하고 UserDetails 객체를 생성하는 역할을 담당
 *
 * @author : jonghoon
 * @fileName : UserDto
 * @since : 10/1/24
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    /**
     * 사용자 ID를 받아 해당 사용자의 인증 정보를 로드합니다.
     *
     * @param userEmail the username identifying the user whose data is required.
     * @return
     */
    @Override
    public UserDetails loadUserByUsername(String userEmail) {

        // [STEP1] 사용자 아이디를 조회하여 존재하지 않는 경우 오류를 반환합니다.
        if (userEmail == null || userEmail.isEmpty()) {
            throw new AuthenticationServiceException("사용자 ID가 비어있습니다.");
        }

        // [STEP2] 서비스를 호출하여 실제 데이터베이스 조회를 통해서 사용자 정보를 조회합니다.
        return userService.login(UserDto.builder().mbrEmail(userEmail).build())
                .map(user -> new UserDetailsDto(user, Collections.singleton(new SimpleGrantedAuthority(user.getMbrEmail()))))
                .orElseThrow(() -> new BadCredentialsException("사용자 정보가 올바르지 않습니다: " + userEmail));
    }
}