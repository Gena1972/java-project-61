package hexlet.code.games;

import hexlet.code.Engine;


import java.util.Random;

public class Even {
    public static final int MAXVALUE = 1000;
    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] evenData;
        evenData = evenPrepData();
        Engine.engine(description, evenData);

    }

    public static String[][] evenPrepData() {
        int randValue;
        String[][] evenData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            randValue = genRandValue(MAXVALUE);
            evenData[questionArray][j] = "" + randValue;
            evenData[answerArray][j] = calculateResult(randValue);
        }
        return evenData;
    }


    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static String calculateResult(int randValue) {
        return (randValue % 2) == 0 ? "yes" : "no";
    }
}
