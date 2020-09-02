package com.yuan.design.pattern.structural.proxy;

/**
 * @ClassName IOrderServiceImpl
 * @Author Administrator
 * @Date 2020/9/1 22:48
 */
public class IOrderServiceImpl implements IOrderService {
    private IOrderDao orderDao;

    public int saveOrder(Order order) {
        // spring 会直接注入，我们就直接new了
        orderDao = new IOrderDaoImpl();
        System.out.println("service 层调用dao层添加order");
        return orderDao.insert(order);
    }
}
