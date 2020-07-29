package com.yuan.design.pattern.structural.composite;

/**
 * @ClassName Course
 * @Author Administrator
 * @Date 2020/4/20 22:28
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name : "+name+" price : "+price);
    }
}
