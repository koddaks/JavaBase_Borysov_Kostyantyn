package com.hillel.borysov.lessons.examples.practice;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


    public static int factorial(int x) {
        System.out.println(x);
    if(x == 1){
        return 1;
    }else {
        return x * factorial (x - 1);
    }





    }
}
