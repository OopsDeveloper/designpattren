package com.oopsdev.designpattern.proxy.two;

public class Main {
    public static void main(String[] args) {
        BankAccount adminAccount = new BankAccountProxy("Admin", 1000);
        adminAccount.deposit(500);
        adminAccount.withdraw(300);

        BankAccount userAccount = new BankAccountProxy("User", 1000);
        userAccount.deposit(500);
        userAccount.withdraw(300);
    }
}
