package com.hillel.borysov.examples;

public class InternMetod {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String firstWord = first.intern();
        String secondWord = second.intern();
        if (firstWord == secondWord) {
            return true;

        } else {
            return false;
        }
    }
}
//        Все строки, которые были заданы в коде в виде литералов, во время работы программы хранятся в памяти в так называемом StringPool.
//        StringPool — это специальный массив для хранения строк. Цель его создания — оптимизация хранения строк:
//
//        Во-первых, строки, заданные в коде, нужно все-таки где-то хранить. Код — это команды, а данные (тем более такие большие как строки) нужно хранить в памяти отдельно от кода.
//        В коде фигурируют только ссылки на объекты-строки.
//
//        Во-вторых, все одинаковые литералы можно хранить в памяти только один раз. Так оно и работает.
//        Когда код вашего класса загружается Java-машиной, все строковые литералы добавляются в StringPool, если их там еще нет.
//        Если уже есть, просто используется ссылка на строку из StringPool.
//
//        Поэтому если в своем коде вы присвоите нескольким String-переменным одинаковые литералы, переменные будут содержать одинаковые ссылки.
//        В StringPool литерал будет добавлен только один раз, во всех остальных случаях будет браться ссылка на уже загруженную в StringPool строку.
//        Метод intern()
//
//        Ну и самое интересное: вы можете программно добавить любую строку в StringPool. Для этого нужно просто вызвать метод intern() у String-переменной.
//
//        Метод intern() добавит строку в StringPool, если ее еще там нет, и вернет ссылку на строку из StringPool.
//
//        Если в StringPool добавить с помощью метода intern() две идентичные строки, метод вернет одинаковые ссылки. Это можно использовать чтобы сравнивать строки по ссылке.