package com.prj.codingstudy.core.biz.domain.auth;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthMemberRoleInf extends TimeStamp {
    String mbrRoleId;

    String mbrRoleName;
}
