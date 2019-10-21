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
        Dog[] dogs = new Dog[256];
        Bird[] birds = new Bird[2];

        // Mr. Hernandez did this
        dogs[0] = new Dog();
        dogs[0].age = 2;
        dogs[0].color = "Black";
        dogs[0].size = "Big";
        dogs[0].name = "Lincoln";
        dogs[0].petType = "dog";

        dogs[0].bark();
        String someone = "Niccoo";
        if (dogs[0].bites(someone)) {
            System.out.println("bit someone!");
        }

        dogs[1] = new Dog();
        dogs[1].age = 2;
        dogs[1].color = "Brown";
        dogs[1].size = "Small";
        dogs[1].name = "Java";
        dogs[1].petType = "dog";


        //Jack
        dogs[7] = new Dog();
        dogs[7].age = 5;
        dogs[7].color = "Brown";
        dogs[7].size = "Big";
        dogs[7].name = "Eevee";
        dogs[7].petType = "dog";

        // Pretty much everything from here on out is from Nicco.

        dogs[2] = new Dog();
        dogs[2].age = 2;
        dogs[2].color = "Gray";
        dogs[2].size = "Medium";
        dogs[2].name = "Processing";
        dogs[2].petType = "dog";


        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null) {
                System.out.println(dogs[i].name + " is a " + dogs[i].petType + " of age " + dogs[i].age + " and is color " + dogs[i].color + " and is of size " + dogs[i].size);
                System.out.println("-----------------------------------");
            }
        }

        Owl[] owls = new Owl[1];

        owls[0] = new Owl();
        owls[0].age = 3;
        owls[0].color = "Brown and Black";
        owls[0].size = "small";
        owls[0].name = "Sowl";
        owls[0].petType = "Owl";

        for (int i = 0; i < owls.length; i++) {
            System.out.println(owls[i].name + " is a " + owls[i].size + " " + owls[i].petType + ". he is " + owls[i].age + " years old and he is " + owls[i].color);
        }

        owls[0].barks();
        String person = "Sal";
        if (owls[0].pecks(person)) {
            System.out.println("*Sowl pecked Sal and Sowl flew away!*");
        }




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


        Dog dog1 = new Dog("Nicco", 4, "Brown", "Big", "Dog", 6);
        Dog dog2 = new Dog("Jack", 2, "Black", "Small", "Dog", 9);
        Dog dog3 = new Dog("Sal", 8, "White", "Tall", "Dog", 4);
        Dog dog4 = new Dog("Hayden", 3, "Brown", "Fat", "Dog", 2);
        dogs[3] = dog1;
        dogs[4] = dog2;
        dogs[5] = dog3;
        dogs[6] = dog4;
        for (int i = 3; i < dogs.length; i++) {
            if(dogs[i] != null) {
                dogs[i].announce();
            }
        }
        for (int i = 3; i < dogs.length; i++) {
            if(dogs[i] != null) {
                if (i < 2) {
                    dogs[i].bark();
                } else {
                    dogs[i].fetch();
                }
            }
        }


        System.out.println("-----------------------------------");
        Parrot parrot = new Parrot("Parrot", 5, "Red", "parrot", true);
        parrot.addFriend(dog1);
        parrot.addFriend(dog3);
        parrot.announce();
        parrot.announceFriends();
    }
}
