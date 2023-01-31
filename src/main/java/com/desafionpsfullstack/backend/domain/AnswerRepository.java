package com.desafionpsfullstack.backend.domain;

import com.desafionpsfullstack.backend.entities.Answers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answers, Integer> {
}
