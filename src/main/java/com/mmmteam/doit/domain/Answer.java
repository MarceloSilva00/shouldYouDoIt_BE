package com.mmmteam.doit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Answer {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String msg;

    @NotNull
    private String img;

    private Answer() {
    }

    public Answer(@NotNull String msg, @NotNull String img) {
        this.msg = msg;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
