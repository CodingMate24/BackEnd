package com.prj.codingstudy.core.biz.domain.auth;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthMemberRole extends TimeStamp {
    private String mbrId;

    private String mbrRoleId;
}
