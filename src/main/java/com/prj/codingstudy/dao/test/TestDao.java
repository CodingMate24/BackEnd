package com.prj.codingstudy.dao.test;

import com.prj.codingstudy.domain.test.TestInput;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    String selectTest(TestInput input) throws Exception;
}
