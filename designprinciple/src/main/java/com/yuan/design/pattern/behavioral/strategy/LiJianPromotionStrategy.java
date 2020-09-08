package com.yuan.design.pattern.behavioral.strategy;

/**
 * @ClassName LiJianPromotionStrategy
 * @Author Administrator
 * @Date 2020/9/9 0:09
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("实现立减促销，课程的价格直接减去配置的价格。");
    }
}
