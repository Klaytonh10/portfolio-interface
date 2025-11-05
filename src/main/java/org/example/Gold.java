package org.example;

import org.example.finance.FixedAsset;

public class Gold extends FixedAsset {

    private double weight;

    private static double pricePerOunce = 3976.89;

    public Gold(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return weight * pricePerOunce;
    }

}
