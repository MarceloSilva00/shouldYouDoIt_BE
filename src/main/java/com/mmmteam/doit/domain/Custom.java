package com.mmmteam.doit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Custom {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String key;

    @NotNull
    private String msg;

    @NotNull
    private String img;

    public Custom() {
    }

    public Custom(@NotNull String key, @NotNull String msg, @NotNull String img) {
        this.key = key;
        this.msg = msg;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    @Override
    public String toString() {
        return "Custom{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", msg='" + msg + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
