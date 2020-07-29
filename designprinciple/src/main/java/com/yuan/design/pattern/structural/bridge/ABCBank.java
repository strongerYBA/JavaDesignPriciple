package com.yuan.design.pattern.structural.bridge;

/**
 * @ClassName ABCBank
 * @Author Administrator
 * @Date 2020/4/23 22:49
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国农业银行账号！");
        account.openAccount();
        return account;
    }
}
