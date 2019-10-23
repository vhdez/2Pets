package org.sla;
import java.util.Scanner;

//This is Nicco's stuff.


public class Bird {

    //private Scanner input;

    private String color;
    private String breed;
    private String name;
    private int age;
    private String food;

    public Bird(String color, String breed, String name, int age){

        this.color = color;
        this.breed = breed;
        this.name = name;
        this.age = age;

    }

    String getColor() {
        return this.color;
    }

    String getBreed() {
        return this.breed;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }


    void addToArray(Bird[] birds, int n){

        birds[n] = this;

    }


    void chirp(){

        if(!this.breed.equals("Angry")) {
            System.out.println("Chirp!");
        }else{
            System.out.println("Kaw!");
        }

    }

    boolean fly(){

        if(this.breed.equals("Ostrich") || this.breed.equals("Penguin") || this.breed.equals("Roadrunner") || this.breed.equals("Peacock")) {

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
