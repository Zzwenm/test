package com.example.domain;

/**
 * Created by Zzwen on 2019/9/25 17:34
 */
public class Score {
    private String subject;
    private Integer score;
    public Score(String subject,Integer score){
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
