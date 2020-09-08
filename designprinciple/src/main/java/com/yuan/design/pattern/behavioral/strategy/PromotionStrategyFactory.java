package com.yuan.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrategyFactory
 * @Author Administrator
 * @Date 2020/9/9 0:29
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> map = new HashMap<String, PromotionStrategy>();
    private static final PromotionStrategy empty = new EmptyPromotionStrategy();

    static {
        map.put(Promotionkey.MANJIAN, new ManJianPromotionStrategy());
        map.put(Promotionkey.FANXIAN, new FanXianPromotionStrategy());
        map.put(Promotionkey.LIJIAN, new LiJianPromotionStrategy());
    }

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = map.get(promotionKey);
        return promotionStrategy == null ? empty : promotionStrategy;
    }

    private interface Promotionkey {
        final String LIJIAN = "LIJIAN";
        final String MANJIAN = "MANJIAN";
        final String FANXIAN = "FANXIAN";
    }
}
