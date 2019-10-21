package org.sla;

// Author: Mr. Hernandez

public class Dog {
    // Fields describe the class
    String color;
    String size;
    int age;
    String name;
    String petType;
    int speed;
    Parrot[] friends;

    public Dog(){
        this.friends = new Parrot[256];
    }

    // Methods do actions for the class
    public Dog(String name, int age, String color, String size, String petType, int speed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.petType = petType;
        this.speed = speed;
        this.friends = new Parrot[256];
    }

    public void addFriend(Parrot parrot){
        if(friends != null && friends.length > 0){
            for(int i = 0; i < friends.length; i++){
                if(friends[i] == null){
                    friends[i] = parrot;
                    return;
                }
            }
        }
    }

    public void announce(){
        System.out.println(name + " is a " +
                petType + " with " + color +
                " hair and is " + age +
                " years old. It is a " + size.toLowerCase() + " " + petType.toLowerCase());
    }
    boolean bites(String whom){
        if(whom.equals("Jack")){
            return true;
        }

        return false;
    }

    public void bark(){
        if(age >= 3){
            System.out.println(name + ": WOOF!");
        }else{
            System.out.println( name + ": *woof*");
        }
    }

    public void fetch(){
        if(speed <= 5){
            System.out.println(name + ": I can't go fetch. I'm too slow.");
        }else{
            System.out.println(name + ": I caught it!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Parrot[] getFriends() {
        return friends;
    }

    public void setFriends(Parrot[] friends) {
        this.friends = friends;
    }
}