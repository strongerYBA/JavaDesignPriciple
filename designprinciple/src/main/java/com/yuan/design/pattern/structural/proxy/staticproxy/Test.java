package com.yuan.design.pattern.structural.proxy.staticproxy;

import com.yuan.design.pattern.structural.proxy.Order;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/1 23:23
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
}
