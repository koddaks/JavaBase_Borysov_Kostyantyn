package com.hillel.borysov.lessons.examples;

public class bubbleSort {
// Сортировка Пузырьком

    public static void main(String[] args) {
       int[] array = new int[]{ 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        printArray(array);


        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;

                }


            }

            printArray(array);
        }



    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i > 0) {
                System.out.print(", ");

            }
            System.out.print(arr[i]);



        }
        System.out.println("]");
    }




}


