package com.hillel.borysov.lessons.examples.practice;

public class CountDown {
    private static void countdown(int i) {
        System.out.println(i);

        // base case
        if (i <= 0) {
            return;
        } else {
            countdown(i - 1);
        }
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
