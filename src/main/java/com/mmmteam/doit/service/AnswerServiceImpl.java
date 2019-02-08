package com.mmmteam.doit.service;

import com.mmmteam.doit.domain.Answer;
import com.mmmteam.doit.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    private AnswerRepository answerRepository;

    @Autowired
    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public Answer random() {
        return answerRepository.random();
    }

    @Override
    public Iterable<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer add(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public void remove(long id) {
        answerRepository.deleteById(id);
    }
}
