package com.yuan.design.pattern.behavioral.mediator;

/**
 * @ClassName User
 * @Author Administrator
 * @Date 2020/9/15 22:27
 */
public class User {
    public String getName;

    public User(String getName) {
        this.getName = getName;
    }

    public void sendMessage(String message) {
        StudyGroup.shouMessage(this, message);
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }
}
