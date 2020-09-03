package com.yuan.design.pattern.behavioral.templatemethod;

/**
 * @ClassName DesignPatternCourse
 * @Author Administrator
 * @Date 2020/9/3 22:08
 */
public class DesignPatternCourse extends ACourse {

    void packageCourse() {
        System.out.println("提供课程java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
