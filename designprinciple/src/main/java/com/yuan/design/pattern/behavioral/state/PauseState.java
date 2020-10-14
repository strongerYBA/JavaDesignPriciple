package com.yuan.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author Administrator
 * @Date 2020/10/14 12:52
 */
public class PauseState extends CourseVideoState {
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.playState);
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.speedState);
    }

    public void pause() {
        System.out.println("暂停播放视频的状态！");
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.stopState);
    }
}
