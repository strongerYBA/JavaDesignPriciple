package com.yuan.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者。
 *
 * @ClassName Teacher
 * @Author Administrator
 * @Date 2020/9/14 20:58
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public void update(Observable o, Object arg) {
        // 被观察者。
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问答：" + question.getQuestionContent());
    }
}
