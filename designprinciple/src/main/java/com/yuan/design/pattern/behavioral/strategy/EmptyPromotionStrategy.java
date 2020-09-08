package com.yuan.design.pattern.behavioral.strategy;

/**
 * @ClassName EmptyPromotionStrategy
 * @Author Administrator
 * @Date 2020/9/9 0:36
 */
public class EmptyPromotionStrategy  implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("没有任何促销！");
    }
}
