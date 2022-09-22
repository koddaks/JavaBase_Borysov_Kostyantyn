package com.hillel.borysov.examples;

public class randomValue {
    public static int getRandomDiceNumber(int min, int max) {
        return (min + (int) (Math.random() * (max - min + 1)));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            int x = getRandomDiceNumber(2,10);
            System.out.println(x);
        }
    }

}
