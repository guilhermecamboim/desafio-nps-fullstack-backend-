package com.desafionpsfullstack.backend.controller;

import com.desafionpsfullstack.backend.domain.QuestionRepository;
import com.desafionpsfullstack.backend.entities.Question;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Api(tags = "Question")
@CrossOrigin(origins = "http://127.0.0.1:5173")
@AllArgsConstructor
public class QuestionController {
    QuestionRepository repository;

    @GetMapping("/questions")
    public List<Question> getAllQuestion() { return repository.findAll(); }
}
