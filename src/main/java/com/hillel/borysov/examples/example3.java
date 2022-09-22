package com.hillel.borysov.examples;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String result = path.replace('/', '\\');

        System.out.println("ТЕКСТ" + result);
    }
}
