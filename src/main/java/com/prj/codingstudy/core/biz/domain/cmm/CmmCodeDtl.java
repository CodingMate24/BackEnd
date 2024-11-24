package com.prj.codingstudy.core.biz.domain.cmm;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class CmmCodeDtl extends TimeStamp {
    private String cmmCodeId;

    private String cmmCodeSubId;

    private String cmmCodeSubSeq;

    private String cmmCodeSubName;
}
