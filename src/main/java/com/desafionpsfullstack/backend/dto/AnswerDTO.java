package com.desafionpsfullstack.backend.dto;

// com.sun.istack.NotNull (do jaxb do Hibernate 5) não existe mais no Hibernate 7; lombok.NonNull mantém as mesmas checagens de nulo geradas pelo Lombok
import lombok.NonNull;
import lombok.Data;
import java.util.List;

@Data
public class AnswerDTO {
    @NonNull
    private Integer questionId;
    private String answerOfUser;
    @NonNull
    public Integer rangeSelected;
}
