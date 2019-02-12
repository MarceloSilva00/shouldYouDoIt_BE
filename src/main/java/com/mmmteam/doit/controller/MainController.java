package com.mmmteam.doit.controller;

import com.mmmteam.doit.domain.Answer;
import com.mmmteam.doit.domain.SearchResult;
import com.mmmteam.doit.service.AnswerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class MainController {

    private AnswerService answerService;


    public MainController(@Qualifier(value = "answerService") AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public SearchResult answer(@RequestParam(value = "search",required = false,defaultValue = "random") String search) {
        if (search.equals("random")) {
            Answer a = answerService.random();
            return new SearchResult(a.getMsg(), a.getImg());
        } else {
            Answer a = answerService.customResponse(search.toLowerCase());
            return new SearchResult(a.getMsg(), a.getImg());
        }
    }

    @GetMapping("/all")
    public Iterable<SearchResult> findAll() {
        List<SearchResult> l = new LinkedList<>();
        for (Answer a : answerService.findAll()) {
            l.add(new SearchResult(a.getMsg(), a.getImg()));
        }
        return l;
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


