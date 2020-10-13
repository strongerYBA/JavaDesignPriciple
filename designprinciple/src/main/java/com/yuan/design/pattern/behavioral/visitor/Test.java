package com.yuan.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/10/13 11:38
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice(10);
        codingCourse.setName("java 设计模式讲解");
        courseList.add(codingCourse);
        courseList.add(freeCourse);
        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
