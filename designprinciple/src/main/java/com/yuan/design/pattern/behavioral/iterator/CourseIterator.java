package com.yuan.design.pattern.behavioral.iterator;

/**
 * @ClassName CourseIterator
 * @Author Administrator
 * @Date 2020/9/6 23:01
 */
public interface CourseIterator {
    Course nextCourse();

    boolean isLastCourse();
}
