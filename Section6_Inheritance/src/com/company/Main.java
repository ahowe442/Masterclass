package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Ella", 8, 70, 2, 4, 1, 20, "Black and Medium");

        dog.eat();
        System.out.println("*****************");
        //dog.walk();
        System.out.println("*****************");
        dog.run();
    }
}
