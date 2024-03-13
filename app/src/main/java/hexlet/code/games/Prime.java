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
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int maxValue = 100;
        int randValue;
        String result;
        String[][] primeData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            randValue = genRandValue(maxValue);
            primeData[questionArray][j] = "" + randValue;
            primeData[answerArray][j] = "" + calculateResult(primeNumbers, randValue);
        }
        return primeData;
    }



    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static String calculateResult(int[]primeNumbers, int randValue) {
           return (Arrays.binarySearch(primeNumbers, randValue) > 0) ? "yes" : "no";
    }
}


