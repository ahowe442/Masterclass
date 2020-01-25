package com.company.compositionchallenge;

public class Walls {
    private int doors;
    private int windows;
    private int pictures;

    public Walls(int doors, int windows, int pictures) {
        this.doors = doors;
        this.windows = windows;
        this.pictures = pictures;
    }

    public void paintWalls(String color){
        System.out.println("The walls were painted the color "+ color);
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getPictures() {
        return pictures;
    }
}
