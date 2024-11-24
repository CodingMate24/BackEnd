package com.prj.codingstudy.core.biz.domain.board;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class BoardCategory extends TimeStamp {
    private String boardId;

    private String boardName;

    private int boardOrder;
}
