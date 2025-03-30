package com.prj.codingstudy.core.service.manage;

import com.prj.codingstudy.core.domain.manage.ManageMenuInf;

import java.util.List;

public interface ManageMenuService {
    public List<ManageMenuInf> selectMenuList() throws Exception;
}
