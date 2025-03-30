package com.prj.codingstudy.core.controller;

import com.prj.codingstudy.core.service.auth.AuthEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/email-auth")
public class EmailAuthController {
    private final AuthEmailService authEmailService;

    /* 인증을 위한 이메일 발송 */
    @GetMapping("/send")
    public ResponseEntity<?> sendEmail() throws Exception {
        authEmailService.saveEmailAuth("lsa6689@naver.com");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    /* 이메일 인증 확인 */
//    @PostMapping("/check")
//    public ApiResponseDto<EmailAuthCheckResponse> checkEmailAuth(
//            @RequestBody EmailAuthCheckRequest emailAuthCheckRequest
//            ) {
//        EmailAuthCheckResponse response = emailAuthService.isEmailVerified(emailAuthCheckRequest.getEmail(), emailAuthCheckRequest.getId());
//        return ApiResponseDto.successResponse(response);
//    }

    /* 이메일 인증 완료
    * 이메일에 전송된 URL 클릭 시
    * 해당 요청을 여기서 처리
    * */
//    @GetMapping("/verify")
//    public ApiResponseDto<String> emailAuth(
//            @RequestParam String emailToken
//    ) {
//        emailAuthService.updateEmailAuth(emailToken);
//        return ApiResponseDto.successResponse("이메일 인증이 완료되었습니다.");
//    }
}
