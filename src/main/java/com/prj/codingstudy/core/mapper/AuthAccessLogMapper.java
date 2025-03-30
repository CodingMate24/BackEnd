package com.prj.codingstudy.core.mapper;

import com.prj.codingstudy.core.domain.auth.AuthAccessLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthAccessLogMapper {
    int insertAccessLog(AuthAccessLog authAccessLog);
}
