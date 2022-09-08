package com.hillel.borysov.lessons.lesson7;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 155; i++) {

            if ((i / 100 == 4) || (i / 100 == 9)) { // В данном if проверка на 4 и на 9 не нужна(если только число будет от 400 и до 1000 то понадобится)
                continue;
            }
            if ((i / 10 % 10 == 4) || (i / 10 % 10 == 9)) {
                continue;
            }

            if ((i % 10 == 4) || (i % 10 == 9)) {
                continue;
            }

            count++;

            System.out.println("Number of shatle: " + i);
            System.out.println("Count: " + count);


        }

    }

}


//            System.out.println(number / 100);
//            System.out.println(number / 10 % 10);
//            System.out.println(number % 10);

//            System.out.println(Arrays.toString(String.valueOf(i).toCharArray()));