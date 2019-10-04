package org.sla;

public class Pet {

    String name;
    int age;
    String[] atributes;
    String color;
    String size;
    PetType type;

    public Pet(String name, int age, String color, String size, PetType type, String[] atributes){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.type = type;
        this.atributes = atributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAtributes() {
        return atributes;
    }

    public void setAtributes(String[] atributes) {
        this.atributes = atributes;
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

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    enum PetType{

        DOG, CAT, HAMSTER, TURTLE;
    }

}
