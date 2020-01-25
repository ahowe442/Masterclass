public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 1000;

//        if(score < 5000 && score >1000){
//            System.out.println("Your score is less than 5000 but greater than 1000 ");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got Here");
//        }

        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

        }

        System.out.println("*****Challenge******");
        System.out.println("1. Print out a second score with the following: \n \t A.  Score set to 1000" +
                " \n \t B.  LevelCompleted set to 8.  \n \t C.  Bonus set to 200. " +
                "\n \t D.  BUTTTTTT make sure the previous scores still print above.  ");

        int score2 = 1000;
        int levelComplete2 = 8;
        int bonus2 = 200;

        if (gameOver) {
            int finalScore2 = score2 + (levelComplete2 * bonus2);
            System.out.println("Your final score was:" + finalScore2);

            // The benefit of this method is that you get to keep a permanent record of both sets of variables.
            // This uses more memory because you are creating new set of variables stored in memory.
        }

        score2 = 2000;
        levelComplete2 = 8;
        bonus2 = 200;

        if (gameOver) {
            int finalScore2 = score2 + (levelComplete2 * bonus2);
            System.out.println("Your final score was:" + finalScore2);

            // benefit of this method is it's faster to create because you are simply reassigning a new value
            // to the variable instead of creating a new set of variables.


        }
    }
}
