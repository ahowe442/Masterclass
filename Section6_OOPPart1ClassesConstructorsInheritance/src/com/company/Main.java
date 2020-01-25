package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car ford = new Car();
        //In the 2 lines above we created a new data type of type car. We created an object porsche of type car.
        // Not much we can do with these two lines of code yet.
        // We want to access the fields we create in the car class.
        System.out.println("The car model is: "+ porsche.getModel());
        porsche.setModel("Carrera");
        ford.setModel("Escape");
        //This calls the porsche's setModel method which set's the model to "Carrera".
        System.out.println("The car model is: "+ porsche.getModel());
        System.out.println(" Make: Ford Model: "+ ford.getModel());

    }
}
