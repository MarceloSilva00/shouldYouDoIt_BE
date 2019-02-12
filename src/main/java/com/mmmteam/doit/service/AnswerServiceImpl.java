package com.mmmteam.doit.service;

import com.mmmteam.doit.domain.Answer;
import com.mmmteam.doit.domain.Custom;
import com.mmmteam.doit.repository.AnswerRepository;
import com.mmmteam.doit.repository.CustomAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

@Service(value = "answerService")
public class AnswerServiceImpl implements AnswerService {

    private AnswerRepository answerRepository;
    private CustomAnswerRepository customAnswerRepository;



    public AnswerServiceImpl(AnswerRepository answerRepository,CustomAnswerRepository customRepository) {
        this.answerRepository = answerRepository;
        this.customAnswerRepository = customRepository;
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

    @Override
    public Answer customResponse(String search) {
        StringTokenizer st = new StringTokenizer(search);
        while (st.hasMoreTokens()) {
            String aux = st.nextToken();
            Custom c = customAnswerRepository.findByKey(aux);
            if (c != null) {
                return new Answer(c.getMsg(),c.getImg());
            }
        }
        return answerRepository.random();
    }
}
