package com.prj.codingstudy.core.biz.domain.auth;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthMemberDtl extends TimeStamp {
    private String mbrId;

    private String mbrName;

    private String mbrSex;

    private String mbrTel1;

    private String mbrTel2;

    private String mbrTel3;
}
