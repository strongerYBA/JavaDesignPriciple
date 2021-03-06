package com.yuan.design.pattern.structural.adapter.objectadapter;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/1/20 13:21
 */
public class Test {
    public static void main(String[] args) {
        //直接实现者。
        Target target = new ConcreteTarget();
        target.request();

        //适配器模式。
        Target adapter = new Adapter();
        adapter.request();
    }
}
