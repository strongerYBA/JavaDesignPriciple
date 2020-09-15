package com.yuan.design.pattern.behavioral.command;

/**
 * @ClassName OpenCourseVideo
 * @Author Administrator
 * @Date 2020/9/15 21:55
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.open();
    }
}
