package com.desafionpsfullstack.backend.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @NotNull
    private Integer questionId;
    private String answerOfUser;
    @NotNull
    private Integer rangeSelected;


}
