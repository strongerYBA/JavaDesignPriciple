package com.yuan.design.pattern.behavioral.mediator;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/15 22:27
 */
public class Test {
    public static void main(String[] args)  {
        User user1 = new User("yuan");
        User user2 = new User("bi");
        user1.sendMessage("bi  开始学习了吗？");
        user2.sendMessage("yuan 是滴！");
    }
}
