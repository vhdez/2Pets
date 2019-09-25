package org.sla;

public class Pets {
    // Fields

    // Method
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[0].age = 2;
        dogs[0].color = "Black";
        dogs[0].size = "Big";
        dogs[0].name = "Lincoln";
        dogs[0].petType = "dog";

        dogs[0].barks();
        String someone = "Nicco";
        if (dogs[0].bites(someone)) {
            System.out.println("bit someone!");
        }

        dogs[1] = new Dog();
        dogs[1].age = 2;
        dogs[1].color = "White";
        dogs[1].size = "Small";
        dogs[1].name = "Java";
        dogs[1].petType = "dog";

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].name + " is a " + dogs[i].petType + " of age " + dogs[i].age + " and is color " + dogs[i].color + " and is of size " + dogs[i].size);
        }
    }
}
