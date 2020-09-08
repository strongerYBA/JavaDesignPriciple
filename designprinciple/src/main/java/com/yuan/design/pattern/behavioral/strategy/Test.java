package com.yuan.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/9 0:17
 */
public class Test {
    //    public static void main(String[] args) {
//        PromotionActivity activity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity activity11 = new PromotionActivity(new FanXianPromotionStrategy());
//        activity618.executeStrategy();
//        activity11.executeStrategy();
//    }
//    public static void main(String[] args) {
//        PromotionActivity activity = null;
//        String promotionKey = "LIJIAN";
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            activity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "MANJIAN")) {
//            activity = new PromotionActivity(new ManJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
//            activity = new PromotionActivity(new FanXianPromotionStrategy());
//        }
//        activity.executeStrategy();
//    }
    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        activity.executeStrategy();
    }
}
