package com.mmmteam.doit.controller;

import com.mmmteam.doit.domain.Answer;
import com.mmmteam.doit.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping
@CrossOrigin
public class MainController {

    private AnswerService answerService;


    @Autowired
    public MainController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public Answer answer() {
        return answerService.random();
    }

    @GetMapping("/all")
    public Iterable<Answer> findAll() {
        return answerService.findAll();
    }

    @PostMapping
    public Answer add(@RequestBody Answer answer) {
        return answerService.add(answer);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(value = "id") long id) {
        answerService.remove(id);
    }
}


