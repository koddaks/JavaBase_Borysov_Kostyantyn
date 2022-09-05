package com.hillel.borysov.lessons.lesson7;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
