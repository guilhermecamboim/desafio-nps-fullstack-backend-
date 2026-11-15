package com.desafionpsfullstack.backend.entities;

// com.sun.istack.NotNull (do jaxb do Hibernate 5) não existe mais no Hibernate 7; lombok.NonNull mantém as mesmas checagens de nulo geradas pelo Lombok
import lombok.NonNull;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "Answers")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private Integer questionId;
    private String answerOfUser;
    @NonNull
    private Integer rangeSelected;


}
