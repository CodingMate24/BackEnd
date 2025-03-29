package com.prj.codingstudy.core.domain.board;

import com.prj.codingstudy.core.domain.TimeStamp;
import lombok.Data;

@Data
public class BoardFile extends TimeStamp {
    private String boardId;

    private int boardSeq;

    private int boardFileSeq;

    private String boardFileName;

    private String boardFilePath;

    private String boardFileRealPath;

    private String boardFileExtension;

}
