package com.mmmteam.doit.domain;

public class SearchResult {

    private String msg;

    private String img;

    public SearchResult(String msg, String image) {
        this.msg = msg;
        this.img = image;
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

    public void setImg(String image) {
        this.img = image;
    }
}
