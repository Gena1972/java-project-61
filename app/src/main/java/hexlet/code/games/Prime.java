package hexlet.code.games;

import hexlet.code.Engine;


import java.util.Arrays;
import java.util.Random;

public class Prime {

    public static void play() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] primeData;
        primeData = primePrepData();
        Engine.engine(description, primeData);

    }

    public static String[][] primePrepData() {
        int maxValue = 100;
        int randValue;
        String result;
        String[][] primeData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            randValue = genRandValue(maxValue);
            primeData[questionArray][j] = "" + randValue;
            primeData[answerArray][j] = "" + calculateResult(randValue);
        }
        return primeData;
    }


    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    private static String calculateResult(int randValue) {
        if (randValue < 2) {
            return "no";
        }
        for (int k = 2; k <= Math.sqrt(randValue); k++) {
            if (randValue % k == 0) {
                return "no";
            }
        }
        return "yes";
    }
}



