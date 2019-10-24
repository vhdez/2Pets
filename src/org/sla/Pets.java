package org.sla;
import java.util.Scanner;

// Author: Mr. Hernandez

public class Pets {
    // Fields
    // Method
    public static void main(String[] args) {
        Pet[] pets = new Pet[256];
        Bird[] birds = new Bird[2];

        Scanner input = new Scanner(System.in);
        // Mr. Hernandez did this

        Bird Red = new Bird("Red", "Angry", 5, 5, 5,"Bird");
        Bird Chuck = new Bird("Chuck", "Yellow", 5, 5,3,"Bird");
        Red.addToArray(birds, 0);
        Chuck.addToArray(birds, 1);
        Red.addFriend(Chuck);
        Chuck.addFriend(Red);
        System.out.println("\n");
        Red.chirp();
        Chuck.fly();
        System.out.println("\n");

        for (int i = 0; i < birds.length; i++) {
            //System.out.println("\n");
            birds[i].announce();
            birds[i].announceFriends();
            System.out.println("\n");
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

        System.out.println("\n");

        Red.feed(input);


        pets[2] = new Owl("Sowl","Brown and Black", 3, 1, 1, "owl");

        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null) {
                System.out.println(pets[i].name + " is a " + pets[i].height + " feet and "+ pets[i].weight + " pound " + pets[i].petType + ". he is " + pets[i].age + " years old and he is " + pets[i].color);
            }
        }

        ((Owl)pets[2]).barks();
        String person = "Sal";
        if (((Owl)pets[2]).pecks(person)) {
            System.out.println("Sowl pecked Sal and Sowl flew away!");
        }



    }
}