package org.example.finance;

public abstract class FixedAsset implements Valuable {

    String name;
    double marketValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return marketValue;
    }

    public void setValue(double value) {
        this.marketValue = value;
    }
}
