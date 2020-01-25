package com.company;

import java.util.Scanner;

import static com.company.ArrayAndScannerExercise.getIntegers;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(3);
        int[] sorted =  sortArray(myIntegers);
        printArray(sorted);


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Element "+ i + " value in printArray Method  is "+ array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int  temp;
        while(flag == true){
            flag = false;
            // element 0 =  345
            // element 1 = 43
            // element 2 =  1
            for (int i=0;  i < sortedArray.length; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] =  sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }

            }
        }


        return sortedArray;
    }

}