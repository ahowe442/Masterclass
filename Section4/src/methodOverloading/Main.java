package methodOverloading;

public class Main {
    public static void main(String[] args){
        int newScore = calculateScore("Abby", 500);
        System.out.println("New score is "+  newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(2, 6);
        calcFeetAndInchesToCentimeters(35);
        calcFeetAndInchesToCentimeters(-1);
        calcFeetAndInchesToCentimeters(1, -1);

        /* These are examples of an  overloaded method.
        The IDE looks at the parameter types to determine which of the same-named methods to use.
        changing the return type does not make the signature unique.   See the 4th commented out example.
         */

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("The player named "+ playerName + " scored "+ score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("The unnamed player scored "+ score + " points.");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name and no player score");
        return 0;
    }


//    public static void calculateScore(){
//        System.out.println("No player name and no player score");
//    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        boolean isValidNum = true;
        if (feet < 0){
            isValidNum = false;
        }else if (inches < 0){
            isValidNum = false;
        }

        if (isValidNum == true){
            double totalInches = (feet*12) + inches;
            double totalCentimeters = totalInches * 2.54d;
            System.out.println(feet +" feet and " + inches +" inches equal: "+ totalCentimeters + " centimeters");
            return totalCentimeters;
        } else if (isValidNum == false){
            System.out.println("please use a valid number");
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        boolean isValidNum = true;
        if (inches < 0){
            isValidNum = false;
        }

        if (isValidNum == true){
            calcFeetAndInchesToCentimeters(0, inches);
        } else if (isValidNum == false){
            System.out.println("please use a valid number");
        }
        return -1;
    }
}
