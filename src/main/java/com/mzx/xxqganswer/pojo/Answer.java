package com.mzx.xxqganswer.pojo;

//import lombok.Data;

import java.io.Serializable;

//@Data
public class Answer implements Serializable {

    private String answer;
    private Integer id;
    private String title;

    public Answer() {
    }

    public Answer(String answer, Integer id, String title) {
        this.answer = answer;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
