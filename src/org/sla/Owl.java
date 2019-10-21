package org.sla;

// Author: Mr. Hernandez

public class Owl {
    // Fields describe the class
    String color;
    String size;
    int age;
    String name;
    String petType;

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
