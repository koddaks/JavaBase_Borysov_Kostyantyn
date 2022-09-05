package com.hillel.borysov.lessons.lesson6;

import java.util.Scanner;

public class Main {

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 10) + 1;

    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int defuseNumber = getRandomDiceNumber();
        int tryValue = 9;
        int timer = 10;
        while (true) {
            System.out.println("Enter Defuse Number: ");

            int guessNumber = scanner.nextInt();
            System.out.println(timer);
//            if (guessNumber != scanner.nextInt()){
//                scanner.next();
//                System.out.println("Wrong Data. Ha-ha-ha");
//                tryValue--;
//            }
            if (timer == 0) {
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
