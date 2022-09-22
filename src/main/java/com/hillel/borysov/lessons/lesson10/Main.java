package com.hillel.borysov.lessons.lesson10;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[getSize(scanner)][getSize(scanner)];
        System.out.println("Before transposition: ");
        fillArray(array);
        printArray(array);
        System.out.println("After transposition: ");
        int[][] transpositionArray = Arrays.copyOf(array, array.length);
        transposition(transpositionArray);
        printArray(transpositionArray);

    }



    public static int getSize(Scanner scanner) {
        System.out.println("Enter Integer :");
        int inputValue;

        while (true) {
            if (scanner.hasNextInt()) {
                inputValue = scanner.nextInt();
                if (inputValue >= 0) {
                    break;
                }
            } else {
                System.out.println("Wrong data! Input Integer from 0 to ");
                scanner.nextLine();
            }
        }
        return inputValue;
    }

    public static void fillArray(int[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = k;
                k++;
            }
        }


    }
    public static void transposition(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }

        }
    }

    public static void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

