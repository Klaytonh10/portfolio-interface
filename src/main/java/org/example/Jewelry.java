package org.example;

import org.example.finance.FixedAsset;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double karat) {
        super.setName(name);
        this.karat = karat;
    }

}
