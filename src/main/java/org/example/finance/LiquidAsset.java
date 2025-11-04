package org.example.finance;

public abstract class LiquidAsset implements Valuable {

    String name;
    double balance = 0;

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdrawl(double amount) {
        this.balance -= amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
