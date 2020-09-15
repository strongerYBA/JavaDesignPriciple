package com.yuan.design.pattern.behavioral.command;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/15 22:05
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java设计模式");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }
}
