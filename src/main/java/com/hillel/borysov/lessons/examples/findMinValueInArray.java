package com.hillel.borysov.lessons.examples;

public class findMinValueInArray {

//    Поиск минимального значения в массиве

    public static void main(String[] args) {
        int[] array = new int[]{ 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;

            }


        }
        System.out.println("Min value is: " + minValue + "      index: " + minIndex);





    }




















}
