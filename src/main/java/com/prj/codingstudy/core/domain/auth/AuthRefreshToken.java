package com.prj.codingstudy.core.domain.auth;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

import java.sql.Date;

@Data
public class AuthRefreshToken extends TimeStamp {
    private String mbrId;

    private String mbrRefreshToken;

    private String expiredYn;

    private Date expiredDt;

}
