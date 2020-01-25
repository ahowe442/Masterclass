package com.company;

public class Main {

    public static void main(String[] args) {
        //Declare and initialize the array called myIntArray.
        // Save values into ar array.
        int[] myIntArray = new int[10];
        myIntArray[0]=45;
        myIntArray[1]=476;
        myIntArray[5]=50;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[5]);

        // shortcut for saving values in an array.
        int[]mySecondIntArray = new int[25];
        //int[] mySecondIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(mySecondIntArray[2]);
        System.out.println(mySecondIntArray[5]);
        System.out.println(mySecondIntArray[8]);

        for (int i = 0; i<mySecondIntArray.length; i++){
            mySecondIntArray[i]=i*10;

        }
        for (int i = 0; i<mySecondIntArray.length; i++){
            System.out.println("Element "+ i + " value is "+ mySecondIntArray[i]);
        }
        printArray(myIntArray);

    }
    public static void printArray(int[] array){
        for (int j = 0; j <array.length; j++){
            System.out.println("Element "+ j + " value in printArray Method  is "+ array[j]);
        }
    }

}
