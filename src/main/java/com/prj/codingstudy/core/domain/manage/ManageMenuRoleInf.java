package com.prj.codingstudy.core.domain.manage;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

@Data
public class ManageMenuRoleInf extends TimeStamp {
    private String menuRoleId;

    private String menuRoleName;
}
