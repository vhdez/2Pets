package org.sla;

// Author: Mr. Hernandez

public class Pets {
    // Fields
    static Dog[] dogs = new Dog[4];
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

        dogs[0].bark();
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
        System.out.println("-----------------------------------");
        Dog dog1 = new Dog("Nicco", 4, "Brown", "Big", "Dog", 6);
        Dog dog2 = new Dog("Jack", 2, "Black", "Small", "Dog", 9);
        Dog dog3 = new Dog("Sal", 8, "White", "Tall", "Dog", 4);
        Dog dog4 = new Dog("Hayden", 3, "Brown", "Fat", "Dog", 2);
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogs[3] = dog4;
        for(int i = 0; i < dogs.length; i++){
            dogs[i].announce();
        }
        for(int i = 0; i < dogs.length; i++){
            if (i < 2){
                dogs[i].bark();
            }else{
                dogs[i].fetch();
            }
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

        System.out.println("-----------------------------------");
        Parrot parrot = new Parrot("Parrot", 5, "Red", "parrot", true);
        parrot.addFriend(dog1);
        parrot.addFriend(dog3);
        parrot.announce();
        parrot.announceFriends();
    }
}
