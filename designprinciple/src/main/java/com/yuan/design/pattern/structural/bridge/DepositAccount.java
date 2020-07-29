package com.yuan.design.pattern.structural.bridge;

/**
 * @ClassName DepositAccount
 * @Author Administrator
 * @Date 2020/4/23 22:41
 */
public class DepositAccount implements Account
{
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号！");
    }
}
