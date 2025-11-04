package org.example.finance;

public abstract class FixedAsset implements Valueable {

    String name;
    double marketValue;

    public String getName() {
        return name;
    }

    public double getValue() {
        return marketValue;
    }
}
