package com.prj.codingstudy.core.biz.domain.manage;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class ManageMenuRole extends TimeStamp {
    private int menuSeq;

    private int menuRoleId;

}
