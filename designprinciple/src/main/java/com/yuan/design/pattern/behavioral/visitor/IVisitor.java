package com.yuan.design.pattern.behavioral.visitor;

public interface IVisitor {
    void visit(FreeCourse course);

    void visit(CodingCourse codingCourse);
}
