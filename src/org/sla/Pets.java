package org.sla;
import java.util.ArrayList;
import java.util.Scanner;

// Author: Mr. Hernandez

public class Pets {
    // Fields

    // Method
    public static void main(String[] args) {
        Dog[] dogs = new Dog[256];
        Bird[] birds = new Bird[2];

        Scanner input = new Scanner(System.in);




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

//<<<<<<< Updated upstream

        Red.feed(input);

//>>>>>>> Stashed changes
    }
}
