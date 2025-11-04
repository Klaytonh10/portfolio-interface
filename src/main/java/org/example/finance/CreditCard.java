package org.example.finance;

public class CreditCard extends LiquidAsset {

    private String name;
    private String accountNumber;
    private double balance;



    public CreditCard(String name, String accountNumber, double balance) {

    }

    public void charge(double amount) {

    }

    @Override
    public double getValue() {
        return 0;
    }

}
