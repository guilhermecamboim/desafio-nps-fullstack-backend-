package com.desafionpsfullstack.backend.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class ListAnswerDTO {
    private List<AnswerDTO> answersOfQuestions;
}
