package com.hillel.borysov.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
        final String li = "Li";
        final double totalNumberOfWarriorsLi = 860;

        double warriorLiAttack = 13;
        double archerLiAttack = 24;
        double riderLiAttack = 46;

        final String min = "Min";
        final double coefficient = 1.5;
        final double totalNumberOfWarriorsMin = 860 * coefficient;

        double warriorMinAttack = 13;
        double archerMinAttack = 24;
        double riderMinAttack = 46;

        totalAttack(li,warriorLiAttack,archerLiAttack,riderLiAttack,totalNumberOfWarriorsLi);
        totalAttack(min,warriorMinAttack,archerMinAttack,riderMinAttack,totalNumberOfWarriorsMin);

    }

    public static void totalAttack(String army,double warriorAttack,double archerAttack,double riderAttack,double totalNumberOfWarriors) {
        double totalAttackValue = (warriorAttack + archerAttack + riderAttack) * totalNumberOfWarriors;
        System.out.println("Загальна атака війська " + army + ": " + totalAttackValue);

    }
}
