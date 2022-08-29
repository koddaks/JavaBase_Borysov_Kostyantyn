package com.hillel.borysov.lessons.examples.practice;

import static com.hillel.borysov.lessons.examples.practice.MinValue.printArray;

public class SelectionSortTry {
    public static void main(String[] args) {
        int[] array = new int[]{26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int start = 0; start < array.length; start++) {
            printArray(array);

            int index = min(array, start);

            int tmp = array[start];
            array[start] = array[index];
            array[index] = tmp;




        }


    }

    public static int min(int [] array, int start) {

        int minIndex = start;
        int minValue = array[start];



        for (int i = start + 1; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }

        }

        return minIndex;
    }
}
