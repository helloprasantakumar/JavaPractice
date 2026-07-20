package com.oops.polymorphism;


class Animal{
    void sound(){
        System.out.println("Animal Sounds");
    }

}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Cat meow");
    }
}



public class RunTimePolyMorphism {

    public static void main(String[] args) {
        Animal dog= new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();


    }
}
