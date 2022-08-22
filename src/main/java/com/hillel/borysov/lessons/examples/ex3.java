package com.hillel.borysov.lessons.examples;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String result = path.replace('/', '\\');

        System.out.println("ТЕКСТ" + result);
    }
}
