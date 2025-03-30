package com.prj.codingstudy.config.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * tb_user 테이블과 매핑되는 DTO 클래스입니다.
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDto extends TimeStamp {
    // 사용자 시퀀스
    private String mbrId;

    // 사용자 이메일
    private String mbrEmail;

    // 사용자 패스워드
    @JsonIgnore
    private String mbrPw;

    // 사용자 닉네임
    private String mbrNickname;

    private String mbrProvider;

    private String mbrProviderId;


    @Builder(toBuilder = true)
    private UserDto(String mbrId, String mbrEmail, String mbrPw, String mbrNickname, String mbrProvider, String mbrProviderId) {
        this.mbrId = mbrId;
        this.mbrEmail = mbrEmail;
        this.mbrPw = mbrPw;
        this.mbrNickname = mbrNickname;
        this.mbrProvider = mbrProvider;
        this.mbrProviderId = mbrProviderId;
    }

}
