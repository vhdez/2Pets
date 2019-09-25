package org.sla;

// Author: Mr. Hernandez

public class Pets {
    // Fields

    // Method
    public static void main(String[] args) {
        Cat[] cats = new Cat[1];
        cats[0] = new Cat();
        cats[0].age = 4;
        cats[0].color = "Black & White";
        cats[0].size = "Small";
        cats[0].name = "Lola";
        cats[0].petType = "Cat";
        cats[0].mood = "Sassy";
        cats[0].meows();

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name + " is a " + cats[i].petType + " of age " + cats[i].age + " and is color " + cats[i].color + " and is of size " + cats[i].size + " and is acting " + cats[i].mood);
        }

        Dog[] dogs = new Dog[3];
        // Mr. Hernandez did this
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

        dogs[2] = new Dog();
        dogs[2].age = 6;
        dogs[2].color = "Black";
        dogs[2].size = "Small";
        dogs[2].name = "Gianny";
        dogs[2].petType = "dog";

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].name + " is a " + dogs[i].petType + " of age " + dogs[i].age + " and is color " + dogs[i].color + " and is of size " + dogs[i].size);
        }
    }
}
