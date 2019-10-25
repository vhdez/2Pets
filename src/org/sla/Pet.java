package org.sla;

public class Pet {

    String name;
    String color;
    int age;
    Pet[] friends;
    int height, weight;
    String petType;

    public Pet(String name, String color, int age, int height, int weight, String petType){
        this.name = name;
        this.color = color;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.petType = petType;
        friends = new Pet[256];
    }

    public void addFriend(Pet pet){
        if(friends != null && friends.length > 0){
            for(int i = 0; i < friends.length; i++){
                if(friends[i] == null){
                    friends[i] = pet;
                    return;
                }
            }
        }
    }

    public void announce(){
        System.out.println(name + " is a " +
                color + " " + petType +
                " and is " + age +
                " years old. It is " + height + " feet tall and it weighs " + weight + " lbs.");
    }

    public void announceFriends(){
        if(friends != null){
            if(friends.length > 0){
                for(int i = 0; i < friends.length; i++){
                    if(friends[i] != null){
                        Pet friend = friends[i];
                        if(i > 0){
                            System.out.println(name +  " is also friends with " + friend.name + ", a " +friend.color.toLowerCase() + " " + petType + "." );
                        }else {
                            System.out.println(name + " is friends with " + friend.name + ", a " + friend.color.toLowerCase() + " " + petType + ".");
                        }
                    }
                }
            }
        }
    }

}
