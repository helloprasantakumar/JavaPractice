package com.oops.inheritance;


class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog{
    void play(){
        System.out.println("Puppy is playing");
    }
}



public class MultiLevelInheritance {

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.play();
        puppy.bark();
        puppy.eat();
    }



}
