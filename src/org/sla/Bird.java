package org.sla;

//This is Nicco's stuff.


public class Bird {

    private String color;
    private String breed;
    private String name;
    private int age;

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

        if(this.breed.equals("Ostrich") || this.breed.equals("Penguin") || this.breed.equals("Roadrunner")) {

            System.out.println(this.name + " can't fly!");
            return false;

        }

        System.out.println("Swoosh");
        return true;

    }


}
