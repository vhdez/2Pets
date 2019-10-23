package org.sla;

public class Fish extends Pet{
    //constructor
    public Fish(String name, String color, int age, int height, int weight, String petType) {
        super(name, color, age, height, weight, petType);
    }
    public void swim(){
        System.out.println("*swims*");
    }
}
