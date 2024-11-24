package com.prj.codingstudy.core.biz.domain.manage;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class ManageMenuRoleInf extends TimeStamp {
    private String menuRoleId;

    private String menuRoleName;
}
