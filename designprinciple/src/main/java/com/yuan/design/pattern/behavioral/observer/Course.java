package com.yuan.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 被观察者。继承{@link Observable}就可以被观察。
 *
 * @ClassName Course
 * @Author Administrator
 * @Date 2020/9/14 20:56
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交问题。");
        this.setChanged();
        this.notifyObservers(question);
    }
}
