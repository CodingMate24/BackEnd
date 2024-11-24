package com.prj.codingstudy.core.biz.domain.auth;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthMemberInf extends TimeStamp {
    private String mbrId;

    private String mbrEmail;

    private String mbrPw;

    private String mbrNickname;

    private String mbrProvider;

    private String mbrProviderId;
}
