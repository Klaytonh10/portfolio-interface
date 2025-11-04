package org.example;

import org.example.finance.Valueable;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Valueable> valueables = new ArrayList<>();

    public void addAsset(Valueable valueable) {
        this.valueables.add(valueable);
    }

    double getValue() {
        double value = 0;

        for(Valueable a: valueables) {
            value += a.getValue();
        }
        return value;
    }

}
