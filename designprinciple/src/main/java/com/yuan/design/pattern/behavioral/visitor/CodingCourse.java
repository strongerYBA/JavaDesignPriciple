package com.yuan.design.pattern.behavioral.visitor;

/**
 * @ClassName FreeCourse
 * @Author Administrator
 * @Date 2020/10/13 10:58
 */
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
