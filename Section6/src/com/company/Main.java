package com.company;

public class Main {

    public static void main(String[] args) {
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else if (value == 3) {
//            System.out.println("Value was 3");
//        }
        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is a 3, 4, or 5");
                System.out.println("Actually the value is: "+ switchValue);
                break;
            default:
                System.out.println("Value was not a 1, 2, 3, 4, or 5");
                break;
        }

        /* create a new switch statement using char instead of int.
        create a new char variable.
        create a new switch statement testing for A, B, C, D or E.
        display a nessage if any of these are found then break.
        add a default "not found"

         */

        char switchChar = 'D';
        switch (switchChar){
            case 'A':
                System.out.println("Value is A ");
                break;
            case 'B':
                System.out.println("Value is B ");
                break;
            case 'C':
                System.out.println("Value is C ");
                break;
            case 'D':
                System.out.println("Value is D ");
                break;
            default:
                System.out.println("Error");
                break;
        }

        String month = "MarCh";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("The month is "+ month.toLowerCase() + " 1st month");
                break;
            case "february":
                System.out.println("The month is " + month.toLowerCase() + " 2nd month");
                break;
            case "march":
                System.out.println("The month is "+ month.toLowerCase() + " 3rd month");
                break;
        }


    }
}
