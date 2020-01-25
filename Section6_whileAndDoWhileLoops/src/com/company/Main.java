package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        System.out.println("Examples of the While Loop: \n");
        while (count != 6) {
            System.out.println("Value set 1 is " + count);
            count++;
        }
        System.out.println("\n");
        System.out.println("************************* \n");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value set 2 is " + count);
            count++;
        }


        System.out.println("\n");
        System.out.println("************************* \n");
        count = 1;
        do {
            System.out.println("Count value set 3 is: " + count);
            count++;

            if (count > 100) {
                break;
            }
        }while (count != 6);

        int num = 4;
        int count1 = 0;
        int finishNumber = 20;
        while(num <= finishNumber){
            num++;
            if(!isEven(num)){
                continue;
            }
            count1++;
            System.out.println(num + " is a even number");

            if (count1 >= 5){
                System.out.println("You've found "+ count1 + " even numbers");
                break;
            }

        }

    }
    public static boolean isEven(int number){

        if (number%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
