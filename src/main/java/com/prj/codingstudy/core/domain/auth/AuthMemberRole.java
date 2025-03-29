package com.prj.codingstudy.core.domain.auth;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthMemberRole extends TimeStamp {
    private String mbrId;

    private String mbrRoleId;
}
