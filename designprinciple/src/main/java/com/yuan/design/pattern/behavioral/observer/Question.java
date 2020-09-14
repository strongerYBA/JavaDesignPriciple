package com.yuan.design.pattern.behavioral.observer;

/**
 * @ClassName Question
 * @Author Administrator
 * @Date 2020/9/14 20:57
 */
public class Question {
    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
