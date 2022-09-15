package com.hillel.borysov.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lotteryArray[] = new int[7];
        int userArray[] = new int[7];

        System.out.println("Your numbers is: " + Arrays.toString(generationUserArray(userArray)));
        System.out.print("Lottery numbers is: ");
        generationLotteryArray(lotteryArray);
        System.out.println("Number of coincidences:" + numberOfCoincidences(userArray, lotteryArray));

    }


    public static int numberOfCoincidences(int[] userArray, int[] lotteryArray) {
        int numberOfCoincidences = 0;

        Arrays.sort(userArray);
        Arrays.sort(lotteryArray);

        for (int i = 0; i < lotteryArray.length; i++) {
            if (userArray[i] == lotteryArray[i]) {
                numberOfCoincidences = numberOfCoincidences + 1;

            }

        }

        return numberOfCoincidences;
    }

    public static int[] generationUserArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = inputByUserArray(scanner);
        }
        return array;
    }

    public static void generationLotteryArray(int array[]) {
        for (int i = 0; i < 6; i++) {
            array[i] = getRandomNumber();
        }
        System.out.println(Arrays.toString(array));

    }

    public static int inputByUserArray(Scanner scanner) {
        int tmp = Integer.MIN_VALUE;
        int countOfNumbers = 7;


        while (countOfNumbers > 0) {
            System.out.println("Please enter integer number from 0 to 9: ");

            if (scanner.hasNextInt()) {
                tmp = scanner.nextInt();
                if (tmp > 9 || tmp < 0) {
                    System.out.println("Only from 0 to 9 !");
                    scanner.nextLine();
                    continue;
                }
                countOfNumbers--;
                break;
            } else if (!scanner.hasNextInt()) {
                System.out.println("Wrong data!");
                scanner.nextLine();
            }

        }
        return tmp;
    }


    public static int getRandomNumber() {
        int min = 0;
        int max = 9;
        return (min + (int) (Math.random() * (max - min + 1)));
    }

}

