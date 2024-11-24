package com.prj.codingstudy.core.biz.domain.manage;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class ManageMenuInf extends TimeStamp {
    private int menuSeq;

    private String menuType;

    private String menuName;

    private String menuTitle;

    private String menuUrl;

    private String menuComponent;

    private String menuIcon;

    private String menuUseYn;

}
