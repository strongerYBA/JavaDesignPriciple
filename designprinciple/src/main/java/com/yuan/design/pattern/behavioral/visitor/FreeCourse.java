package com.yuan.design.pattern.behavioral.visitor;

/**
 * @ClassName FreeCourse
 * @Author Administrator
 * @Date 2020/10/13 10:58
 */
public class FreeCourse extends Course {
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
