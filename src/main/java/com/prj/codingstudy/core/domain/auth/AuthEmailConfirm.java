package com.prj.codingstudy.core.domain.auth;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

import java.sql.Date;

@Data
public class AuthEmailConfirm extends TimeStamp {
    private int emSendSeq;

    private String mbrEmail;

    private String emToken;

    private String emVerifiedYn;

    private Date expiredDt;
}
