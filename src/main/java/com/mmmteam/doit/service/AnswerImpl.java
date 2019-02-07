package com.mmmteam.doit.service;

import com.mmmteam.doit.domain.Answer;
import com.mmmteam.doit.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerImpl implements AnswerService {

    private AnswerRepository answerRepository;

    @Autowired
    public AnswerImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public Answer random() {
        return answerRepository.random();
    }
}
