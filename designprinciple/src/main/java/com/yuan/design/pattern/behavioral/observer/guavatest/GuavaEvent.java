package com.yuan.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * 订阅者。
 * @ClassName GuavaEvent
 * @Author Administrator
 * @Date 2020/9/14 21:27
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String s) {
        // 业务逻辑
        System.out.println("执行subscribe方法，入参是：" + s);
    }
}
