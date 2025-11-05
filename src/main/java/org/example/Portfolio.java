package org.example;

import org.example.finance.Valuable;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Valuable> valueables = new ArrayList<>();

    public void addAsset(Valuable valueable) {
        valueables.add(valueable);
    }


    public double getValue() {
        double value = 0;

        for(Valuable a: valueables) {
            value += a.getValue();
        }
        return value;
    }

    Valuable getMostValuable() {

        Valuable mostValuableThing = valueables.get(0);

        for(Valuable currentValuable : valueables) {
            if(currentValuable.getValue() > mostValuableThing.getValue()) {
                mostValuableThing = currentValuable;
            }
        }
        return mostValuableThing;
    }

}
