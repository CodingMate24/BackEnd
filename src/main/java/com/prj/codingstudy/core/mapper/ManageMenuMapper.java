package com.prj.codingstudy.core.mapper;

import com.prj.codingstudy.core.domain.manage.ManageMenuInf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageMenuMapper {
    List<ManageMenuInf> getMenuList(String str) throws Exception;

}
