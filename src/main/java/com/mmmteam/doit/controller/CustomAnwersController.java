package com.mmmteam.doit.controller;

import com.mmmteam.doit.domain.Custom;
import com.mmmteam.doit.repository.CustomAnswerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/custom")
@CrossOrigin
public class CustomAnwersController {

    CustomAnswerRepository customAnswerRepository;

    public CustomAnwersController(CustomAnswerRepository customAnswerRepository) {
        this.customAnswerRepository = customAnswerRepository;
    }

    @GetMapping
    public Iterable<Custom> all(){
        return customAnswerRepository.findAll();
    }

    @PostMapping
    public Custom add(@RequestBody Custom custom){
        return customAnswerRepository.save(custom);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(value = "id") Long id){
        customAnswerRepository.deleteById(id);
    }
}
