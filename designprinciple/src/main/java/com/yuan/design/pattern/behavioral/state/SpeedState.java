package com.yuan.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author Administrator
 * @Date 2020/10/14 12:52
 */
public class SpeedState extends CourseVideoState {
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.playState);
    }

    public void speed() {
        System.out.println("快进播放视频的状态！");
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.pauseState);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.stopState);
    }
}
