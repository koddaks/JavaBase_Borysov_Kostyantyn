package com.hillel.borysov.lessons.examples.encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setA(10);
        encapsulation.setB(25);
        System.out.println(encapsulation.getA());
        System.out.println(encapsulation.getB());
        System.out.println(encapsulation.showResult());
    }
}
