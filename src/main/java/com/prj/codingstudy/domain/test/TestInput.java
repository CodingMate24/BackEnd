package com.prj.codingstudy.domain.test;

import com.prj.codingstudy.domain.BaseDomain;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter @Setter
@Alias("testInput")
public class TestInput extends BaseDomain {
    String inputStr;
}
