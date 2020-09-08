package com.yuan.design.pattern.behavioral.strategy;

/**
 * @ClassName FanXianPromotionStrategy
 * @Author Administrator
 * @Date 2020/9/9 0:09
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到XXX中。");
    }
}
