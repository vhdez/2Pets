package org.sla;
//import java.util.Scanner;

// Author: Mr. Hernandez

public class Pets {
    // Fields
    // Method
    public static void main(String[] args) {
        Pet[] pets = new Pet[256];

        //Scanner input = new Scanner(System.in);
        // Mr. Hernandez did this

        Bird Red = new Bird("Red", "Angry", 5, 5, 5,"Bird");
        Bird Chuck = new Bird("Chuck", "Yellow", 5, 5,3,"Bird");
        Red.addToArray((pets), 9);
        Chuck.addToArray(pets, 10);
        Red.addFriend(Chuck);
        Chuck.addFriend(Red);
        System.out.println("\n");
        Red.chirp();
        Chuck.fly();
        System.out.println("\n");

        for (int i = 0; i < pets.length; i++) {
            //System.out.println("\n");
            if (pets[i] != null) {
                if (pets[i].petType == "Bird") {
                    pets[i].announce();
                    pets[i].announceFriends();
                    System.out.println("\n");
                }
            }
        }

        Bird bird1 = new Bird("Nicco", "Angry", 5, 5, 5,"Bird");
        Bird bird2 = new Bird("Nicco", "Angry", 5, 5, 5,"Bird");
        if (bird1.equals(bird2)) {
            System.out.println("bird1 EQUALS bird2");
        } else {
            System.out.println("bird1 NOT EQUAL bird2");
        }


        Dog dog = new Dog("Hayden", "white", 10, 7, 10);

        pets[0] = dog;

        Dog dog2 = new Dog("Sal", "yellow", 6, 9, 11);

        pets[1] = dog2;
        dog.addFriend(dog2);
        dog2.addFriend(dog);

        Parrot parrot = new Parrot("Parry", "red", 2, 2, 20);
        pets[2] = parrot;
        parrot.addFriend(dog);
        dog.addFriend(parrot);

        for (int i = 0; i < pets.length; i++) {
            if(pets[i] != null) {
                pets[i].announce();
                pets[i].announceFriends();
            }
        }

        System.out.println("\n");

        //Red.feed(input);


        pets[3] = new Owl("Sowl","Brown and Black", 3, 1, 1, "owl");

        pets[5] = new Fish("Rainbow Fish", "rainbow", 12, 12, 5*10, "fish");
        pets[5].addFriend(dog);
        dog.addFriend(pets[5]);
        pets[5].announce();
        pets[5].announceFriends();
        ((Fish)pets[5]).swim();


        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null) {
                System.out.println(pets[i].name + " is a " + pets[i].height + " feet and "+ pets[i].weight + " pound " + pets[i].petType + ". he is " + pets[i].age + " years old and he is " + pets[i].color);
            }
        }

        ((Owl)pets[3]).barks();
        String person = "Sal";
        if (((Owl)pets[3]).pecks(person)) {
            System.out.println("Sowl pecked Sal and Sowl flew away!");
        }


        pets[4] = new Cat("Lola,", "Black & White", 4, 1, 10, "Cat", "Happy");
        System.out.println(pets[4].name + " is a " + pets[4].petType + " of age " + pets[4].age + " and is color " + pets[4].color + " and is of size " + pets[4].height + " feet and is  " + pets[4].weight + "lbs and is feeling " + ((Cat)pets[4]).mood);

        ((Cat)pets[4]).meows();


    }
}