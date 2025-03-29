package com.prj.codingstudy.core.domain.cmm;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

@Data
public class CmmCodeDtl extends TimeStamp {
    private String cmmCodeId;

    private String cmmCodeSubId;

    private String cmmCodeSubSeq;

    private String cmmCodeSubName;
}
