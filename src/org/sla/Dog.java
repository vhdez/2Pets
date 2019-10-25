package org.sla;

// Author: Mr. Hernandez

public class Dog extends Pet {
    // Fields describe the class

    int speed;

    public Dog(String name, String color, int age, int height, int weight) {
        super(name, color, age, height, weight, "dog");
    }

    // Methods do actions for the class
    boolean bites(String whom) {
        if (whom.equals("Jack")) {
            return true;
        }

        return false;
    }

    public void bark() {
        if (age >= 3) {
            System.out.println(name + ": WOOF!");
        } else {
            System.out.println(name + ": *woof*");
        }
    }

    public void fetch() {
        if (speed <= 5) {
            System.out.println(name + ": I can't go fetch. I'm too slow.");
        } else {
            System.out.println(name + ": I caught it!");
        }
    }

}