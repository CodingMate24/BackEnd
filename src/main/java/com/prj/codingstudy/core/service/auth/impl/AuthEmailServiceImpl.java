package com.prj.codingstudy.core.service.auth.impl;

import com.prj.codingstudy.core.service.auth.AuthEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthEmailServiceImpl implements AuthEmailService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.hostname}")
    private String ADMIN_EMAIL;

    /* 인증을 위한 이메일 발송 */
    public void saveEmailAuth(String email) throws Exception{
        sendEmail(email);
    }

    private void sendEmail(String email) throws Exception{
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            String messageText =
                    "<div style=\"font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; padding: 3em\">\n" +
                            "<div style=\"display:flex; flex-direction:column; align-items:center; gap: 1em; padding: 3em; width: 100%; height: 100%; box-shadow: 0px 0px 1em 0px rgba(0, 0, 0, 0.1); border: 1px solid rgba(0, 0, 0, 0.15); border-radius: 2em; text-align: center;\">" +
                            "<h1>이메일 인증</h1>\n" +
                            "<p>이메일 인증을 위해 아래의 <strong>인증하기</strong> 버튼을 눌러주세요.</p>\n" +
                            "</div>\n" +
                            "</div>";

            helper.setTo(email);
            helper.setFrom(new InternetAddress(ADMIN_EMAIL, "Manager"));
            helper.setSubject("[SEND] 이메일 인증");
            helper.setText(messageText, true);

            mailSender.send(message);
        } catch (MessagingException e) {
            throw new Exception(e.getMessage());
        }
    }

    /* 이메일 인증 완료 */
//    public void updateEmailAuth(String token) {
//        UUID uuid = UUID.fromString(token);
//        EmailAuth emailAuth = emailAuthRepository.findByEmailToken(uuid);
//        if (emailAuth == null) {
//            throw new EmailAuthException("유효하지 않은 토큰입니다.");
//        } else if (emailAuth.isEmailVerified()) {
//            throw new EmailAuthException("이미 인증된 이메일입니다.");
//        } else if (emailAuth.isExpired()) {
//            throw new EmailAuthException("만료된 토큰입니다.");
//        }
//
//        emailAuth.verifyEmail();
//    }

    /* 이메일 인증 확인 */
//    public EmailAuthCheckResponse isEmailVerified(String email, long id) {
//        EmailAuth emailAuth = emailAuthRepository.findById(id)
//                .orElseThrow(() -> new EmailAuthException("유효하지 않은 아이디입니다."));
//
//        if (!emailAuth.getEmail().equals(email)) {
//            throw new EmailAuthException("유효하지 않은 이메일입니다.");
//        }
//
//        return new EmailAuthCheckResponse(emailAuth.getEmail(), emailAuth.isEmailVerified());
//    }
}
