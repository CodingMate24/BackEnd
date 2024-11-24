package com.prj.codingstudy.core.biz.domain.board;

import com.prj.codingstudy.core.biz.domain.TimeStamp;
import lombok.Data;

@Data
public class BoardComment extends TimeStamp {
    private String boardId;

    private int boardSeq;

    private int boardCommentSeq;

    private int boardHighCommentSeq;

    private int boardCommentDepth;
}
