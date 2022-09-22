package com.hillel.borysov.examples.practice;

public class MinValue {
    public static void main(String[] args) {
        int[] array = new int[]{26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int minValue = array[0];
        int minIndex = 0;
        printArray(array);


        for (int i = 1; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }

        }
        System.out.println("Min Value : " + minValue);
        System.out.println("Min Index : " + minIndex);
    }











    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");

            }
            System.out.print(array[i]);


        }
        System.out.println("]");
    }
}
