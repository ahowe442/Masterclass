package com.company;

import java.util.Scanner;

public class ArrayAndScannerExercise {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        //this will allow us to collect and store five integers in the form of an array.
        for(int i=0; i < myIntegers.length; i++){
            System.out.println("Element "+ i + " typed values was "+ myIntegers[i]);
        }
        System.out.println("The average is "+ getAverage(myIntegers));

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+ number + " integer values: \n");
        int[]  values = new int[number];

        for(int i = 0; i< values.length; i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i < array.length;  i++){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }

}
