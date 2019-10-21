package org.sla;

public class Parrot {

    String name;
    int age;
    String color;
    Dog[] friends;
    String petType;
    boolean speak;

    public Parrot(String name, int age, String color, String petType, boolean speak){
        friends = new Dog[256];
        this.name = name;
        this.age = age;
        this.color = color;
        this.petType = petType;
        this.speak = speak;
    }

    public void addFriend(Dog dog){
        if(friends != null && friends.length > 0){
            for(int i = 0; i < friends.length; i++){
                if(friends[i] == null){
                    friends[i] = dog;
                    return;
                }
            }
        }
    }

    public void announce(){
        System.out.println(name + " is a " +
                petType + " with " + color +
                " hair and is " + age +
                " years old. It " + (speak ? "repeats " : "doesn't repeat ") + "after you." );
    }

    public void announceFriends(){
        if(friends != null){
            if(friends.length > 0){
                for(int i = 0; i < friends.length; i++){
                    if(friends[i] != null){
                        Dog friend = friends[i];
                        if(i > 0){
                            System.out.println(name +  " is also friends with " + friend.name + ", a " +friend.color.toLowerCase() + " " +  friend.petType.toLowerCase() + "." );
                        }else {
                            System.out.println(name + " is friends with " + friend.name + ", a " + friend.color.toLowerCase() + " " + friend.petType.toLowerCase() + ".");
                        }
                    }
                }
            }
        }
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog[] getFriends() {
        return friends;
    }

    public void setFriends(Dog[] friends) {
        this.friends = friends;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public boolean isSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }
}
