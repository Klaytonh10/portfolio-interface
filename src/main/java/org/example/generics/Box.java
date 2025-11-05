package org.example.generics;

public class Box<T> {
    private T theValue;

    public Box() {

    }

    public Box(T theValue) {
        this.theValue = theValue;
    }

    public void setTheValue(T theValue) {
        this.theValue = theValue;
    }

    public T getTheValue() {
        return theValue;
    }
}
