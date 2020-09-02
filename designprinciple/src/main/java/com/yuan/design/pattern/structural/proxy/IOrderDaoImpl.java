package com.yuan.design.pattern.structural.proxy;

/**
 * @ClassName IOrderDaoImpl
 * @Author Administrator
 * @Date 2020/9/1 22:46
 */
public class IOrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao 添加order成功！");
        return 1;
    }
}
