package com.hillel.borysov.lessons.lesson11;

public class Person {
    public static String personInfo(String firstName, String lastName, String city, String phoneNumber) {

        String citizen = "Зателефонувати громадянину " + firstName + " " + lastName + " із міста " + city + " " + "можна за номером " + phoneNumber;

        return citizen;
    }
}
