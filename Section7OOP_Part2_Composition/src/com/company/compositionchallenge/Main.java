package com.company.compositionchallenge;

public class Main {
    public static void main(String[] args){
        Size large = new Size(10, 10, 10);
        Furniture couch = new Furniture("couch", 4, "beige", large);
        Walls northWall = new Walls(1, 2, 3);
        Room living = new Room(northWall,1,1,true, couch, large);
        System.out.println(living.getFurniture().getNumberOfSeats());

    }
}
