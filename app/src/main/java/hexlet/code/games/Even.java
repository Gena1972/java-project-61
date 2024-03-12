package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;

public class Even {
    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] evenData;
        evenData = evenPrepData();
        Engine.engine(description, evenData);

    }

    public static String[][] evenPrepData() {
        int randValue;
        int maxValue = 1000;
        String result;
        String[][] evenData = new String[2][Engine.ROUNDS];
        int QuestionArray = 0;
        int AnswerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            randValue = genRandValue(maxValue);
            evenData[QuestionArray][j] = "" + randValue;
            evenData[AnswerArray][j] = calculateResult(randValue);
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
