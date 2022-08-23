package com.hillel.borysov.lessons.examples;

public class binary_search {
    public static void main(String[] args) {
        int [] array = {1, 3, 6 ,7, 8, 16, 17, 21, 22 ,23, 34, 45};

        System.out.println(binarySearch(array, 45));
        System.out.println(binarySearch(array, 24));


    }


    public static Integer binarySearch(int[] array, int number) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == number) {
                return mid;
            }
            if (guess > number){
                high = mid -1;
            }else {
                low = mid + 1;
            }

        }
        return null;


    }
}
