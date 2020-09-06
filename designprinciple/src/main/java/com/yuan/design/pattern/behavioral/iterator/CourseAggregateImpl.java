package com.yuan.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseAggregateImpl
 * @Author Administrator
 * @Date 2020/9/6 23:03
 */
public class CourseAggregateImpl implements CourseAggregate {
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
