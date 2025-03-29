package com.prj.codingstudy.core.domain.auth;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

@Data
public class AuthMemberRoleInf extends TimeStamp {
    String mbrRoleId;

    String mbrRoleName;
}
