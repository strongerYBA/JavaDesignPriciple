package com.yuan.design.pattern.structural.bridge;

/**
 * @ClassName ICBCBank
 * @Author Administrator
 * @Date 2020/4/23 22:51
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开爱存不存账号！");
        account.openAccount();
        return account;
    }
}
