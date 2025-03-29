package com.prj.codingstudy.core.domain.manage;

import com.prj.codingstudy.core.domain.TimeStamp;
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
