package com.yuan.design.pattern.behavioral.state;

/**
 * @ClassName CourseVideoState
 * @Author Administrator
 * @Date 2020/10/14 12:50
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();
}
