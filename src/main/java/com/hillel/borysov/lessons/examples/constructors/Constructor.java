package com.hillel.borysov.lessons.examples.constructors;

public class Constructor {

    public void infoAboutCroco(){
    Crocodile crocodile = new Crocodile("croco", 15,"reptile","tropical lowlands", 250, 5.5 );
        System.out.println("name: " + crocodile.name + "\nage: " + crocodile.age + "\nclass: " + crocodile.clas + "\nweight: " + crocodile.weight + "\nlenght: " + crocodile.lenght );
    }
}
