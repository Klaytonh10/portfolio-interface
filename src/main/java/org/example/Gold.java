package org.example;

import org.example.finance.FixedAsset;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return 0;
    }

}
