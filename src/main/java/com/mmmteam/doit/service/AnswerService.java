package com.mmmteam.doit.service;

import com.mmmteam.doit.domain.Answer;

public interface AnswerService {

    Answer random();

    Iterable<Answer> findAll();

    Answer add(Answer answer);

    void remove(long id);
}
