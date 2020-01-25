package com.company.compositionchallenge;

public class Room {
    private Walls walls;
    private int floor;
    private int ceiling;
    private boolean stairs;
    private Furniture furniture;
    private Size size;

    public Room(Walls walls, int floor, int ceiling, boolean stairs, Furniture furniture, Size size) {
        this.walls = walls;
        this.floor = floor;
        this.ceiling = ceiling;
        this.stairs = stairs;
        this.furniture = furniture;
        this.size = size;
    }



    public Walls getWalls() {
        return walls;
    }

    public int getFloor() {
        return floor;
    }

    public int getCeiling() {
        return ceiling;
    }

    public boolean isStairs() {
        return stairs;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Size getSize(){
        return size;
    }
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.
}
