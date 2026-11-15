package com.desafionpsfullstack.backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class ListAnswerDTO {
    private List<AnswerDTO> answersOfQuestions;
}
