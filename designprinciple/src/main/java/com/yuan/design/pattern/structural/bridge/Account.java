package com.yuan.design.pattern.structural.bridge;

/**
 * 打开账号，
 * 查看账号的类型。
 * @ClassName Account
 * @Author Administrator
 * @Date 2020/4/23 22:37
 */
public interface Account {
    Account openAccount();
    void  showAccountType();
}
