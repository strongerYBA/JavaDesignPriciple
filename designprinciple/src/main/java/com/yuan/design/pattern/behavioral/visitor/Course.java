package com.yuan.design.pattern.behavioral.visitor;

/**
 * @ClassName Course
 * @Author Administrator
 * @Date 2020/10/13 11:00
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
