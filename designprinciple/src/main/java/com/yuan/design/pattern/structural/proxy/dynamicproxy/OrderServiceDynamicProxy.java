package com.yuan.design.pattern.structural.proxy.dynamicproxy;

import com.yuan.design.pattern.structural.proxy.Order;
import com.yuan.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName OrderServiceDynamicProxy
 * @Author Administrator
 * @Date 2020/9/2 21:26
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    // 目标对象通过构造器传进来。
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    // 绑定代理对象。
    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = args[0];
        beforeMethod(obj);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    public void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("动态代理 before code！");
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
        // todo 设置DataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code !");
    }
}
