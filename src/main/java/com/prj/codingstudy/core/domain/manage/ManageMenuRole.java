package com.prj.codingstudy.core.domain.manage;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

@Data
public class ManageMenuRole extends TimeStamp {
    private int menuSeq;

    private int menuRoleId;

}
