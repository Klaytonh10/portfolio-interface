package org.example.finance;

public class House extends FixedAsset {

    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms){
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return 0;
    }


    public double compareTo(House that) {
        double output = 0;
        if(this.squareFeet < that.squareFeet) {
            return -1;
        }
        if(this.squareFeet > that.squareFeet) {
            return 1;
        }
        return output;
    }

}
