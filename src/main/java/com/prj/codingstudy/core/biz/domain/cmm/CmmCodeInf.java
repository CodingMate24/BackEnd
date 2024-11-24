package com.prj.codingstudy.core.biz.domain.cmm;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class CmmCodeInf extends TimeStamp {
    private String cmmCodeId;

    private int cmmCodeSeq;

    private String CmmCodeNm;

    private String cmmBiz;

    private String cmmUseYn;
}
