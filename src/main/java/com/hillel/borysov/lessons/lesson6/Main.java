package com.hillel.borysov.lessons.lesson6;

import java.util.Scanner;

public class Main {

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 10) + 1;

    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int defuseNumber = getRandomDiceNumber();
        int tryValue = 11;
        int timer = 10;


        while (true) {
            System.out.println("Enter Defuse Number: ");


            while (!scanner.hasNextInt()) {
                System.out.println("That not a number Duuude! ");
                scanner.next();

                System.out.println(timer + " seconds left");
                timer--;

                if (timer == 0){
                    System.out.println("Oh Noooo! Time is over: " + timer + " seconds left");
                    System.out.println("That not a number Duuude! BOOOOM");
                    break;
                }


            }


            int guessNumber = scanner.nextInt();


            System.out.println(timer + " seconds left");


            if (guessNumber <= 0 || guessNumber > 10) {
                System.out.println("Wrong Data.We know that the code number ranges from 1 to 10 hurry up dude");

            }
            if (timer == 0 || timer < 0) {
                System.out.println("BOOM!!!");
                break;
            }
            if (guessNumber != defuseNumber) {
                tryValue--;

            }
            if (tryValue == 0) {
                System.out.println("BOOM!!!   Nice Try.");
                break;
            }


            if (guessNumber == defuseNumber) {
                System.out.println("BOMB IS DEFUSED!");
                break;
            }


            timer--;


        }
    }
}
