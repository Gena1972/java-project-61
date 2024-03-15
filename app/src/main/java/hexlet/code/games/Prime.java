package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;


public class Prime {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void play() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] primeData = primePrepData();
        Engine.engine(description, primeData);

    }

    public static String[][] primePrepData() {
        String[][] primeData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
           int randValue = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            primeData[questionArray][j] = "" + randValue;
            primeData[answerArray][j] = isPrime(randValue) ? "yes" : "no";
        }
        return primeData;
    }

    private static boolean isPrime(int randValue) {
        if (randValue < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(randValue); k++) {
            if (randValue % k == 0) {
                return false;
            }
        }
        return true;
    }
}



