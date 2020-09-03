package com.yuan.design.pattern.behavioral.templatemethod;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/3 22:13
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式start。。。");
//        ACourse design = new DesignPatternCourse();
//        design.makeCourse();
//        System.out.println("后端设计模式end。。。");

        System.out.println("前端课程start。。。");
        ACourse fe = new FECourse(true);
        fe.makeCourse();
        System.out.println("前端课程end。。。");
    }
}
