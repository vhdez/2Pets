package org.sla;

// Author: Mr. Hernandez

public class Pets {
    // Fields
    static Dog[] dogs = new Dog[4];
    // Method
    public static void main(String[] args) {
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
        System.out.println("-----------------------------------");
        Parrot parrot = new Parrot("Parrot", 5, "Red", "parrot", true);
        parrot.addFriend(dog1);
        parrot.addFriend(dog3);
        parrot.announce();
        parrot.announceFriends();
    }
}
