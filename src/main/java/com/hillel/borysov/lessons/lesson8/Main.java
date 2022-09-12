package com.hillel.borysov.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static int getRandomNumber() {
        int min = 18;
        int max = 40;
        return (min + (int) (Math.random() * (max - min + 1)));
    }

    public static double averageAge(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        double average = sum / 25;
        return average;
    }

    public static void main(String[] args) {

        int[] firstTeam = new int[25];
        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = getRandomNumber();

        }
        System.out.print("Age of first team players: ");
        System.out.println(Arrays.toString(firstTeam));
        System.out.println("Average age in first team is: " + averageAge(firstTeam));


        int[] secondTeam = new int[25];
        for (int i = 0; i < secondTeam.length; i++) {
            secondTeam[i] = getRandomNumber();

        }
        System.out.print("Age of second team players: ");
        System.out.println(Arrays.toString(secondTeam));
        System.out.println("Average age in second team is: " + averageAge(secondTeam));
    }


}






