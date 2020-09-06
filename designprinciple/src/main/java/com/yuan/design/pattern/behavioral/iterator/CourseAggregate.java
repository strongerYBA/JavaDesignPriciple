package com.yuan.design.pattern.behavioral.iterator;

/**
 * 课程集合抽象类。
 * @ClassName CourseAggregate
 * @Author Administrator
 * @Date 2020/9/6 22:59
 */
public interface CourseAggregate {
    void addCourse(Course course);

    void removeCourse(Course course);

    // 获取课程的迭代器。
    CourseIterator getCourseIterator();
}
