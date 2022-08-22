package com.hillel.borysov.lessons.examples;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String[] array = path.split("/");


        String result = String.join("\\", array);


        System.out.println(result);
    }
}
