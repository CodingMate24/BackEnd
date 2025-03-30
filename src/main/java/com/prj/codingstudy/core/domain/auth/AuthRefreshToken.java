package com.prj.codingstudy.core.domain.auth;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AuthRefreshToken extends TimeStamp {
    private String mbrId;

    private String mbrRefreshToken;

    private String expiredYn;

    private Date expiredDt;

}
