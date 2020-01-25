package secondsAndMinutesChallenge;

public class Main {
    public static void main(String[] args){
        getDurationString(61, 61);
        getDurationString(42, 361);
        getDurationString(1285, 4);
        getDurationString(22566);
    }

    private static int getDurationString(int minutes, int seconds) {
        boolean isValid = false;
        if (minutes >= 0){
            isValid = true;
        }else if (seconds >= 0 && seconds <= 59){
            isValid = true;
        }

        if (isValid == true){
            int secToMin = seconds/60;
            int numOfSec = seconds%60;
            int totalMins = minutes + secToMin;
            int hours = totalMins/60;
            int numOfMin = totalMins%60;

            String hourString = hours + "h";
            if (hours < 10){
                hourString = "0"+ hourString;
            }
            String minString = numOfMin + "m";
            if (numOfMin < 10){
                minString = "0"+ minString;
            }
            String secString = numOfSec + "s";
            if (numOfSec < 10){
                secString = "0"+ secString;
            }

            System.out.println(hourString+" "+ minString + " " + secString);

        }else if (isValid == false){
            System.out.println("Invalid value");

        }
        return -1;
    }
    private static int getDurationString(int seconds) {
        boolean isValid = false;
        if (seconds >= 0){
            isValid = true;
        }

        if (isValid == true){
            getDurationString(0, seconds);

        }else if (isValid == false){
            System.out.println("Invalid value");

        }
        return -1;
    }
}
/*
Instructions for the challenge:

Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return ÅgInvalid valueÅh in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format ÅgXXh YYm ZZsÅh where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return ÅgInvalid valueÅh if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.

Tips:
	Use int or long for your number data types is probably a good idea.
	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	Methods should be static as we have used previously.

Bonus:
	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	Create a new console project and call it SecondsAndMinutesChallenge


 */