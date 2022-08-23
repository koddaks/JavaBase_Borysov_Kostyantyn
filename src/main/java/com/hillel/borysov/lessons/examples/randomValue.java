package com.hillel.borysov.lessons.examples;

public class randomValue {
    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
    }

}
