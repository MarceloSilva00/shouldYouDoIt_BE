package com.mmmteam.doit.domain;

public class Answer {

    private String answer;


    private String image;

    private Answer() {
    }

    public Answer( String answer, String image) {
        this.answer = answer;
        this.image = image;
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
                ", answer='" + answer + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
