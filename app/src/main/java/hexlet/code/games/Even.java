package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] evenData = evenPrepData();
        Engine.engine(description, evenData);

    }

    public static String[][] evenPrepData() {
        String[][] evenData = new String[Engine.ROUNDS][2];
        int questionArray = 0;
        int answerArray = 1;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randValue = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            evenData[i][questionArray] = "" + randValue;
            evenData[i][answerArray] = isEven(randValue) ? "yes" : "no";
        }
        return evenData;
    }
   /* private static String[][] evenPrepData() {
        String[][] evenData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
           int randValue = Utils.generateNumber(MIN_VALUE,MAX_VALUE);
            evenData[questionArray][j] = "" + randValue;
            evenData[answerArray][j] = isEven(randValue) ? "yes" : "no";
        }
        return evenData;
    }*/


    private static boolean isEven(int randValue) {
        return (randValue % 2) == 0;
    }
}
