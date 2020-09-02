package com.yuan.design.pattern.structural.proxy.dynamicproxy;

import com.yuan.design.pattern.structural.proxy.IOrderService;
import com.yuan.design.pattern.structural.proxy.IOrderServiceImpl;
import com.yuan.design.pattern.structural.proxy.Order;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/9/2 21:44
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        IOrderService proxy = (IOrderService) new OrderServiceDynamicProxy(new IOrderServiceImpl()).bind();
        proxy.saveOrder(order);
    }
}
