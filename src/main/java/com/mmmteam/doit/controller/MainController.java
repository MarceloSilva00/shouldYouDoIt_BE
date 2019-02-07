package com.mmmteam.doit.controller;

import com.mmmteam.doit.domain.Answer;
import com.mmmteam.doit.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    private AnswerService answerService;

    @Autowired
    public MainController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public Answer answer(){
        Answer answer =  answerService.random();
        //System.out.println(answer);
        return answer;

    }
}


