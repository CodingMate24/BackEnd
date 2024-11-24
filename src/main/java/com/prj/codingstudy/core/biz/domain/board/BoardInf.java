package com.prj.codingstudy.core.biz.domain.board;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class BoardInf extends TimeStamp {
    private String boardId;

    private int boardSeq;

    private String boardTitle;

    private String boardContent;

    private int boardCnt;

    private String boardHideYn;

    private String boardPassword;
}
