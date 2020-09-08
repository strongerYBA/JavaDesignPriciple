package com.yuan.design.pattern.behavioral.strategy;

/**
 * @ClassName ManJianPromotionStrategy
 * @Author Administrator
 * @Date 2020/9/9 0:09
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("满减促销，满100减10元！");
    }
}
