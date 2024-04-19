package com.prj.codingstudy.domain;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
public class BaseDomain {
    // 최초등록ID
    private String frstRegId;

    // 최초등록일시
    private String frstRegDt;

    // 최종수정ID
    private String lastUpdtId;

    // 최종수정일시
    private String lastUpdtDt;

    public BaseDomain() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(date);

        this.frstRegId = now;
        this.lastUpdtDt = now;
    }
}
