package org.sla;
import java.util.Scanner;

//This is Nicco's stuff.


public class Bird extends Pet{

    //private Scanner input;

    //private String breed;
    private String food;

    public Bird(String name, String color, int age, int height, int weight, String petType) {
        super(name, color, age, height, weight, petType);
        //this.food = food;
    }



    void addToArray(Bird[] birds, int n){

        birds[n] = this;

    }


    void chirp(){

        if(!this.petType.equals("Angry")) {
            System.out.println("Chirp!");
        }else{
            System.out.println("Kaw!");
        }

    }

    boolean fly(){

        if(this.petType.equals("Ostrich") || this.petType.equals("Penguin") || this.petType.equals("Roadrunner") || this.petType.equals("Peacock")) {

            System.out.println(this.name + " can't fly!");
            return false;

        }

        System.out.println("Swoosh!");
        return true;

    }


    boolean feed(Scanner input){

        System.out.println("Time to feed " + this.name + "!\nBut with what?");

        this.food = input.nextLine();
        this.food = this.food.toLowerCase();

        System.out.println("\n");

        if(this.food.equals("cracker")){
            System.out.println(this.name + " is uninspired by your \"creative\" food options.");
            return true;
        }else if(this.food.equals("tuna")){
            System.out.println("What were you thinking?! You summoned the mighty eagle.");
            return false;
        }else if(this.food.equals("egg") || this.food.equals("bird") || this.food.equals("birds")){
            System.out.println("What the heck is wrong with you?!");
            return false;
        }else{
            System.out.println(this.name + " is happy!");
            return true;
        }

    }



}
