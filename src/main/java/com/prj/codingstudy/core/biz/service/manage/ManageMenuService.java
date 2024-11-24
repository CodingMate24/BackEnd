package com.prj.codingstudy.core.biz.service.manage;

import com.prj.codingstudy.core.biz.domain.manage.ManageMenuInf;

import java.util.List;


public interface ManageMenuService {
    public List<ManageMenuInf> selectMenuList() throws Exception;
}
