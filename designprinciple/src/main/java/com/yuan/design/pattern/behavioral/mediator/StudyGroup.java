package com.yuan.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @ClassName StudyGroup
 * @Author Administrator
 * @Date 2020/9/15 22:27
 */
public class StudyGroup {
    public static void shouMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName + " ]:" + message);
    }
}
