package org.example.finance;

public class BankAccount extends LiquidAsset {

    private String accountNumber;

    public BankAccount(String name, String accountNumber, double balance) {
        super.name = name;
        this.accountNumber = accountNumber;
        super.balance = balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        super.withdrawl(amount);
    }

}
