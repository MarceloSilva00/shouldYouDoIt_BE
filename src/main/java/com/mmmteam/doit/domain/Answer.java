package com.mmmteam.doit.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Answer {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY) @JsonIgnore
    private Long id;

    @NotNull
    private String answer;

    @NotNull
    private String image;

    private Answer() {
    }

    public Answer(String answer, String image) {
        this.answer = answer;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
