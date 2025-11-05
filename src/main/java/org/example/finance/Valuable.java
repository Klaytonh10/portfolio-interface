package org.example.finance;

public interface Valuable extends Comparable<Valuable> {

    double getValue();

    @Override
    default int compareTo(Valuable that){
        if(this.getValue() > that.getValue()) {
            return 1;
        }
        if(this.getValue() < that.getValue()) {
            return -1;
        }
        return 0;
    }
}
