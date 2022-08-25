package com.hillel.borysov.lessons.examples;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println(format("Maks", 800));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут %s. Я буду зарабатывать %d$ в месяц.";
        System.out.println(phrase);


        return String.format(phrase, name, salary);
    }
}

//Символ	Обозначение
//        String     %s
//
//        целое число: byte, short, int, long     %d
//
//        вещественное число: float, double       %f
//
//        boolean      %b
//
//        char       %c
//
//        Date      %t
//
//        Символ %     %%
//