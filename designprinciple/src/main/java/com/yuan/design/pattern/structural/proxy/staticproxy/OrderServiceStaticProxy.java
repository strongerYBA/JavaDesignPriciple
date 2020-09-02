package com.yuan.design.pattern.structural.proxy.staticproxy;

import com.yuan.design.pattern.structural.proxy.IOrderService;
import com.yuan.design.pattern.structural.proxy.IOrderServiceImpl;
import com.yuan.design.pattern.structural.proxy.Order;
import com.yuan.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @ClassName OrderServiceStaticProxy
 * @Author Administrator
 * @Date 2020/9/1 22:53
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new IOrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        // todo 设置DataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("静态代理 after code !");
    }
}
