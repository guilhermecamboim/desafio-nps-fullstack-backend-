package com.desafionpsfullstack.backend.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class AnswerDTO {
    @NotNull
    private Integer questionId;
    private String answerOfUser;
    @NotNull
    private Integer rangeSelected;
}
