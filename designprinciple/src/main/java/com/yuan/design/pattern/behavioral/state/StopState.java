package com.yuan.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author Administrator
 * @Date 2020/10/14 12:52
 */
public class StopState extends CourseVideoState {
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.playState);
    }

    public void speed() {
        System.out.println("ERROR 停止状态不能快进！");
    }

    public void pause() {
        System.out.println("ERROR 停止状态不能暂停！");
    }

    public void stop() {
        System.out.println("停止播放视频的状态！");
    }
}
