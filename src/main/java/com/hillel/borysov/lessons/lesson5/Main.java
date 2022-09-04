package com.hillel.borysov.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstTeam = null;
        double firstPlayerKills = 0;
        double secondPlayerKills = 0;
        double thirdPlayerKills = 0;
        double fourthPlayerKills = 0;
        double fifthPlayerKills = 0;
        double resultFirstTeam = 0;
        double averageKillsFirstTeam = 0;


        String secondTeam = null;
        double secondTeamFirstPlayerKills = 0;
        double secondTeamSecondPlayerKills = 0;
        double secondTeamThirdPlayerKills = 0;
        double secondTeamFourthPlayerKills = 0;
        double secondTeamFifthPlayerKills = 0;
        double resultSecondTeam = 0;
        double averageKillsSecondTeam = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first team: ");
        firstTeam = scanner.nextLine();
        System.out.println("Name of the first team: " + firstTeam);
        boolean haveAverage = true;
        while (haveAverage) {
            System.out.println("Alternately 5 number of kills of each player:");

            if (scanner.hasNextDouble()) {
                firstPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + firstPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                secondPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + secondPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                thirdPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + thirdPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                fourthPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + fourthPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                fifthPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + fifthPlayerKills);
                scanner.nextLine();


            } else {
                System.out.println("Wrong data. Try again");
                scanner.next();
                continue;

            }
            averageKillsFirstTeam = averageKills(firstPlayerKills, secondPlayerKills, thirdPlayerKills, fourthPlayerKills, fifthPlayerKills);
            System.out.println("The arithmetic mean of first team kills is:" + averageKillsFirstTeam);
            resultFirstTeam = firstPlayerKills + secondPlayerKills + thirdPlayerKills + fourthPlayerKills + fifthPlayerKills;
            haveAverage = false;

        }



        System.out.println("Enter the name of the second team: ");
        secondTeam = scanner.nextLine();

        System.out.println("Name of the second team: " + secondTeam);

        boolean haveSecondAverage = true;
        while (haveSecondAverage) {
            System.out.println("Alternately 5 number of kills of each player:");
            if (scanner.hasNextDouble()) {
                secondTeamFirstPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + secondTeamFirstPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                secondTeamSecondPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + secondTeamSecondPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                secondTeamThirdPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + secondTeamThirdPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                secondTeamFourthPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + secondTeamFourthPlayerKills);
                scanner.nextLine();


            }
            if (scanner.hasNextDouble()) {
                secondTeamFifthPlayerKills = scanner.nextDouble();
                System.out.println("Number of player kills:" + secondTeamFifthPlayerKills);
                scanner.nextLine();


            } else {
                System.out.println("Wrong data. Try again");
                scanner.next();
                continue;
            }
            averageKillsSecondTeam = averageKills(secondTeamFirstPlayerKills, secondTeamSecondPlayerKills, secondTeamThirdPlayerKills, secondTeamFourthPlayerKills, secondTeamFifthPlayerKills);
            System.out.println("The arithmetic mean of second team kills is:" + averageKillsSecondTeam);
            resultSecondTeam = secondTeamFirstPlayerKills + secondTeamSecondPlayerKills + secondTeamThirdPlayerKills + secondTeamFourthPlayerKills + secondTeamFifthPlayerKills;
            haveSecondAverage = false;

        }

        if (averageKillsFirstTeam > averageKillsSecondTeam) {
            System.out.println("The team " + "\"" + firstTeam + "\"" + " with the score: " + resultFirstTeam + " won!!!");
        } else if (averageKillsFirstTeam == averageKillsSecondTeam){
            System.out.println("Draw");
        }else {
            System.out.println("The team " + "\"" + secondTeam + "\"" + " with the score: " + resultSecondTeam + " won!!!");
        }

    }

    public static double averageKills(double firstPlayer, double secondPlayer, double thirdPlayer, double fourthPlayer, double fifthPlayer) {
        double average = (firstPlayer + secondPlayer + thirdPlayer + fourthPlayer + fifthPlayer) / 5;
        return average;


    }


}
