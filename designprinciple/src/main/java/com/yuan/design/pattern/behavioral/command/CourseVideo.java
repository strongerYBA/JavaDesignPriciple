package com.yuan.design.pattern.behavioral.command;

/**
 * @ClassName CourseVideo
 * @Author Administrator
 * @Date 2020/9/15 21:54
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程视频开放！");
    }

    public void close() {
        System.out.println(this.name + "课程视频关闭！");
    }
}
