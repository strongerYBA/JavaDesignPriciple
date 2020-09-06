package com.yuan.design.pattern.behavioral.iterator;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/6 23:23
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java电商第一期！");
        Course course1 = new Course("java电商第二期！");
        Course course2 = new Course("java设计模式精讲！");
        Course course3 = new Course("java电商第四期！");
        Course course4 = new Course("java后端mysql精讲！");
        CourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.addCourse(course);
        aggregate.addCourse(course1);
        aggregate.addCourse(course2);
        aggregate.addCourse(course3);
        aggregate.addCourse(course4);
        System.out.println("----课程列表----");
        printCourse(aggregate);
        aggregate.removeCourse(course);
        aggregate.removeCourse(course3);
        System.out.println("-----------删除操作之后的课程列表---------");
        printCourse(aggregate);
    }

    private static void printCourse(CourseAggregate aggregate) {
        CourseIterator courseIterator = aggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }

    }
}
