package com.yuan.design.pattern.structural.bridge;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2020/4/23 23:01
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();
        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank.openAccount();
        icbcAccount.showAccountType();
        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        icbcAccount.showAccountType();
    }
}
