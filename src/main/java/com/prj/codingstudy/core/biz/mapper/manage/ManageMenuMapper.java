package com.prj.codingstudy.core.biz.mapper.manage;

import com.prj.codingstudy.core.biz.domain.manage.ManageMenuInf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageMenuMapper {
    List<ManageMenuInf> getMenuList(String str) throws Exception;

}
