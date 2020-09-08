package com.yuan.design.pattern.behavioral.strategy;

/**
 * @ClassName PromotionActivity
 * @Author Administrator
 * @Date 2020/9/9 0:12
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executeStrategy() {
        promotionStrategy.doPromotion();
    }
}
