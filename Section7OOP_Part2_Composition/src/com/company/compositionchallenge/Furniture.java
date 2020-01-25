package com.company.compositionchallenge;

public class Furniture {
    private String type;
    private int numberOfSeats;
    private String color;
    private Size size;

    public Furniture(String type, int numberOfSeats, String color, Size size) {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
    }

    public void placeOnFloorPlan(int x, int y){
        System.out.println("This furniture goes at the "+ x+ " x axis and the "+y+ " y axis");
    }

    public String getType() {
        return type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
}
