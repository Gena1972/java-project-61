package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Even {
    public static final int MAX_VALUE = 1000;
    public static final int MIN_VALUE = 1;
    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] evenData = evenPrepData();
        Engine.engine(description, evenData);

    }

    public static String[][] evenPrepData() {
       String[][] evenData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            int randValue = Utils.generateNumber(MIN_VALUE,MAX_VALUE);
            evenData[questionArray][j] = "" + randValue;
            evenData[answerArray][j] = calculateResult(randValue);
        }
        return evenData;
    }

    public static String calculateResult(int randValue) {
        return (randValue % 2) == 0 ? "yes" : "no";
    }
}
