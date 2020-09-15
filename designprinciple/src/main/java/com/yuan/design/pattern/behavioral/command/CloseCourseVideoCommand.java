package com.yuan.design.pattern.behavioral.command;

/**
 * @ClassName CloseCourseVideo
 * @Author Administrator
 * @Date 2020/9/15 21:56
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.close();
    }
}
