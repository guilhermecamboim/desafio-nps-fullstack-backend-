package com.desafionpsfullstack.backend.controller;

import com.desafionpsfullstack.backend.domain.AnswerRepository;
import com.desafionpsfullstack.backend.dto.AnswerDTO;
import com.desafionpsfullstack.backend.entities.Answers;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Answers")
@CrossOrigin(origins = "http://127.0.0.1:5173")
@AllArgsConstructor
public class AnswerController {
    AnswerRepository repository;

    @PostMapping("/answers")
    public Answers savePost(@RequestBody AnswerDTO answerDTO){
        Answers answerPost = Answers.builder()
                .answerOfUser(answerDTO.getAnswerOfUser())
                .rangeSelected(answerDTO.getRangeSelected())
                .build();
        return repository.save(answerPost);
    }

    @GetMapping
    public List<Answers> getAllAnswers() { return repository.findAll();}
}
