package com.yuan.design.pattern.behavioral.templatemethod;

/**
 * @ClassName ACourse
 * @Author Administrator
 * @Date 2020/9/3 21:58
 */
public abstract class ACourse {
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        // 此行为不变，所以为final。
        System.out.println("制作PPT！");
    }

    final void makeVideo() {
        System.out.println("制作视频！");
    }

    final void writeArticle() {
        // 都可以写。可选行为。要编写钩子方法。
        System.out.println("编写手记！");
    }

    // 写手记编写钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    // 此抽象方法可以交由子类实现。不同课程的包装课程也不一样。
    // 要对业务行为抽象好，那些是固定行为，那些是不固定的交给子类的，那些行为是可选的。
    abstract void packageCourse();
}
