package com.yuan.design.pattern.behavioral.visitor;

/**
 * @ClassName Visitor
 * @Author Administrator
 * @Date 2020/10/13 11:06
 */
public class Visitor implements IVisitor {
    // 访问免费课程，打印所有免费课程名称。
    public void visit(FreeCourse course) {
        System.out.println("免费课程：" + course.getName());
    }

    // 访问实战课程，打印所有实战课程名称及价格，
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + " 价格：" + codingCourse.getPrice());
    }
}
