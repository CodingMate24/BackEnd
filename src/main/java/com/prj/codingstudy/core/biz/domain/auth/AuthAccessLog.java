package com.prj.codingstudy.core.biz.domain.auth;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthAccessLog extends TimeStamp {
    private int accessSeq;

    private String accessType;

    private String accessUrl;

    private String accessUrlNm;

    private String accessUrlParam;

    private String accessIp;
}
