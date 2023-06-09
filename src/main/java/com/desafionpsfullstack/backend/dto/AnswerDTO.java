package com.desafionpsfullstack.backend.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import java.util.List;

@Data
public class AnswerDTO {
    @NotNull
    private Integer questionId;
    private String answerOfUser;
    @NotNull
    public Integer rangeSelected;
}
