package com.hillel.borysov.lessons.examples;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут %s. Я буду зарабатывать %d$ в месяц.";

        return String.format(phrase, name, salary);
    }
}
