package org.example;

import org.example.finance.Valueable;

import java.util.ArrayList;

public class Portfolio implements Valueable {

    private ArrayList<Valueable> valueables = new ArrayList<>();

    public void addAsset(Valueable valueable) {
        this.valueables.add(valueable);
    }

    @Override
    public double getValue() {
        double value = 0;

        for(Valueable a: valueables) {
            value += a.getValue();
        }
        return value;
    }

}
