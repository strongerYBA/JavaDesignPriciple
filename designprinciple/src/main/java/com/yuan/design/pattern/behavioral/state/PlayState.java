package com.yuan.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author Administrator
 * @Date 2020/10/14 12:52
 */
public class PlayState extends CourseVideoState {
    public void play() {
        System.out.println("正常播放视频的状态！");
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.speedState);
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.pauseState);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.stopState);
    }
}
