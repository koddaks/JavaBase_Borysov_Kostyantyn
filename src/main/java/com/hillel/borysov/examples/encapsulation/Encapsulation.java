package com.hillel.borysov.examples.encapsulation;

public class Encapsulation {
    private int a;
    private int b;

    public int showResult(){
        return a + b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
