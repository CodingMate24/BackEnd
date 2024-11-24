package com.prj.codingstudy.core.biz.domain;

import jakarta.persistence.EntityListeners;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;

@Data
public class TimeStamp {
    private String delYn;

    @CreatedBy
    private String regId;

    @CreatedDate
    private Date regDt;

    @LastModifiedBy
    private String modId;

    @LastModifiedDate
    private Date modDt;

    public TimeStamp() {
        this.delYn = "N";
    }
}
