package com.desafionpsfullstack.backend.controller;

import com.desafionpsfullstack.backend.domain.AnswerRepository;
import com.desafionpsfullstack.backend.dto.AnswerDTO;
import com.desafionpsfullstack.backend.dto.ListAnswerDTO;
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
    public List<Answers> savePost(@RequestBody ListAnswerDTO answers){
        answers.getAnswersOfQuestions().forEach(q -> {
            Answers getAnswers = Answers.builder()
                    .questionId(q.getQuestionId())
                    .answerOfUser(q.getAnswerOfUser())
                    .rangeSelected(q.getRangeSelected())
                    .build();
            repository.save(getAnswers);
        });
        return getAllAnswers();
    }

    @GetMapping
    public List<Answers> getAllAnswers() { return repository.findAll();}
}
