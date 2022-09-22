package com.hillel.borysov.examples;
//Сортировка выбором.


public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{ 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        printArray(array);

        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);


            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;

        }
        printArray(array);


    }
    private static  int min(int[] array, int start) {

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


    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i > 0) {
                System.out.print(", ");

            }
            System.out.print(array[i]);



        }
        System.out.println("]");
    }




}
