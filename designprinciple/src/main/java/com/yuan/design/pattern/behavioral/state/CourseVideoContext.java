package com.yuan.design.pattern.behavioral.state;

/**
 * @ClassName CourseVideoContext
 * @Author Administrator
 * @Date 2020/10/14 12:50
 */
public class CourseVideoContext {
    private CourseVideoState courseVideoState;
    public final static PlayState playState = new PlayState();
    public final static SpeedState speedState = new SpeedState();
    public final static PauseState pauseState = new PauseState();
    public final static StopState stopState = new StopState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}
