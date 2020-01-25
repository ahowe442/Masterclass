package secton4_video47_methods;

public class Sect4Methods {
    public static void main(String[] args) {

        int playerScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + playerScore);

        playerScore = calculateScore(true, 10000, 6, 200);
        System.out.println("Your final score was: " + playerScore);

        int highScorePosition =  calculateHighScorePosition(1500);
        displayHighScorePosition("Abby", highScorePosition);

        highScorePosition =  calculateHighScorePosition(900);
        displayHighScorePosition("Kellie", highScorePosition);

        highScorePosition =  calculateHighScorePosition(400);
        displayHighScorePosition("Pounce", highScorePosition);

        highScorePosition =  calculateHighScorePosition(50);
        displayHighScorePosition("Ella", highScorePosition);

        highScorePosition =  calculateHighScorePosition(1000);
        displayHighScorePosition("Jan", highScorePosition);

        highScorePosition =  calculateHighScorePosition(500);
        displayHighScorePosition("Tom", highScorePosition);

        highScorePosition =  calculateHighScorePosition(100);
        displayHighScorePosition("George", highScorePosition);


        }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into the number "+ position + " position on the " +
                "high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        } else {
//            return 4;
//        }

        /* this was commented because  having many return statements can be confusing,
         so the following shown as an alternative method.
         */

        int position = 4; //assuming position 4 will be returned.
        if(playerScore >= 1000){
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }

    //This is a new method called calculate score.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
