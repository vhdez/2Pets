package org.sla;

// Author: Mr. Hernandez

public class Cat extends Pet{
    // Fields describe the class

    String mood;


    public Cat(String name, String color, int age, int height, int weight, String
            petType, String myMood) {
        super(name, color, age, height, weight, petType);
        mood = myMood;
    }


   void meows() {
        if (mood.equalsIgnoreCase("happy")) {
            System.out.println("Meow!");
        } else {

            System.out.println("Hiss!");
        }
    }


}
