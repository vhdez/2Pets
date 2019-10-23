package org.sla;

// Author: Mr. Hernandez

public class Pets {
    // Fields
    // Method
    public static void main(String[] args) {
        Pet[] pets = new Pet[256];
        Bird[] birds = new Bird[2];

        // Mr. Hernandez did this


        Bird Red = new Bird("Red", "Angry", "Red", 5);
        Bird Chuck = new Bird("Yellow", "Triangle", "Chuck", 5);
        Red.addToArray(birds, 0);
        Chuck.addToArray(birds, 1);
        System.out.println("\n");
        Red.chirp();
        Chuck.fly();

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i].getName() + " is a " + birds[i].getBreed() + " bird of color " + birds[i].getColor() + " and age " + birds[i].getAge() + ".");
        }


        Dog dog = new Dog("Hayden", "white", 10, 10, 10, "dog");

        pets[0] = dog;

        Dog dog2 = new Dog("Sal", "yellow", 6, 9, 11, "dog");

        pets[1] = dog2;
        dog.addFriend(pets[1]);

        dog.announce();
        dog.announceFriends();

        dog2.announce();
        dog2.addFriend(dog);
        dog2.announceFriends();;

    }
}
