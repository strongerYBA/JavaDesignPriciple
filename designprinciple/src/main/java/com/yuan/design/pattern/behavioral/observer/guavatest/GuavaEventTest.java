package com.yuan.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName GuavaEventTest
 * @Author Administrator
 * @Date 2020/9/14 21:27
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        // 发布者。
        EventBus bus = new EventBus();
        // 订阅者。
        GuavaEvent event = new GuavaEvent();
        bus.register(event);
        bus.post("post的内容。");
    }
}
