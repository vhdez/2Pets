package org.sla;

// Author: Mr. Hernandez

public class Owl extends Pet {


    public Owl(String name, String color, int age, int height, int weight, String
               petType) {
        super(name, color, age, height, weight, petType);
    }

    // Methods do actions for the class
    boolean pecks(String whom) {
        if (whom.equals("Sal")) {
            return true;
        }else
        return false;


    }
    void barks() {
        System.out.println("Hoooo");
    }

}
