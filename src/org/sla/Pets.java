package org.sla;

// Author: Mr. Hernandez

public class Pets {
    // Fields

    // Method
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Bird[] birds = new Bird[2];

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
        dogs[1].color = "Brown";
        dogs[1].size = "Small";
        dogs[1].name = "Java";
        dogs[1].petType = "dog";

        // Pretty much everything from here on out is from Nicco.

        dogs[2] = new Dog();
        dogs[2].age = 2;
        dogs[2].color = "Gray";
        dogs[2].size = "Medium";
        dogs[2].name = "Processing";
        dogs[2].petType = "dog";
        

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].name + " is a " + dogs[i].petType + " of age " + dogs[i].age + " and is color " + dogs[i].color + " and is of size " + dogs[i].size);
        }

        Bird Red = new Bird("Red", "Angry", "Red",5);
        Bird Chuck = new Bird("Yellow", "Triangle","Chuck",5);

        Red.addToArray(birds,0);
        Chuck.addToArray(birds,1);

        System.out.println("\n");

        Red.chirp();
        Chuck.fly();

        for(int i = 0; i < birds.length; i ++){
            System.out.println(birds[i].getName() + " is a " + birds[i].getBreed() + " bird of color " + birds[i].getColor() + " and age " + birds[i].getAge() + ".");
        }

    }
}
