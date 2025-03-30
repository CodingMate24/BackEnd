package com.prj.codingstudy.core.domain.auth;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthAccessLog extends TimeStamp {
    private int accessSeq;

    private String accessType;

    private String accessUrl;

    private String accessUrlNm;

    private String accessParam;

    private String accessIp;
}
