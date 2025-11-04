package org.example;

import org.example.finance.Valuable;

import java.util.ArrayList;

public class Portfolio implements Valuable {

    private ArrayList<Valuable> valueables = new ArrayList<>();

    public void addAsset(Valuable valueable) {
        this.valueables.add(valueable);
    }

    @Override
    public double getValue() {
        double value = 0;

        for(Valuable a: valueables) {
            value += a.getValue();
        }
        return value;
    }

}
