package com.hillel.borysov.lessons.lesson3;

public class Main {
    public static void main(String[] args) {
        areaOfParallelepiped(10, 9, 5);
        lengthAllSidesOfParallelepiped(10,9, 5);
    }

    public static void areaOfParallelepiped(int lengthSide_A, int widthSide_B, int heightSide_C) {
        int volume = lengthSide_A * widthSide_B * heightSide_C;
        System.out.println("\"Об'єм паралелепіпеда = " + volume + " см" + '\u00B3' + "\"");

    }

    public static void  lengthAllSidesOfParallelepiped(int lengthSide_A, int widthSide_B, int heightSide_C) {
        int lengthAllSides = 4 * (lengthSide_A + widthSide_B + heightSide_C);

        System.out.println("\"Сумарна довжина всіх сторін(ребер) паралелепіпеда: " + lengthAllSides + " см\"");

    }
}
