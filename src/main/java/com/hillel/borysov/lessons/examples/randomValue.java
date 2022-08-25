package com.hillel.borysov.lessons.examples;

public class randomValue {
    public static int getRandomDiceNumber() {
        int min = 1;
        int max = 100;
        return (min + (int) (Math.random() * (max - min + 1)));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
    }

}
