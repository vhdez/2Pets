package org.sla;

// Author: Mr. Hernandez

public class Dog {
    // Fields describe the class
    String color;
    String size;
    int age;
    String name;
    String petType;

    // Methods do actions for the class
    boolean bites(String whom) {
        if (whom.equals("Jack")) {
            return true;
        }

        return false;
    }

    void barks() {
        System.out.println("Woof");
    }
}
