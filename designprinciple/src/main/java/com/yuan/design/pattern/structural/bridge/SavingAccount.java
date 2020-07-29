package com.yuan.design.pattern.structural.bridge;

/**
 * @ClassName SavingAccount
 * @Author Administrator
 * @Date 2020/4/23 22:42
 */
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号！");
    }
}
