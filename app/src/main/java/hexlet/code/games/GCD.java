package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;
import java.util.Random;

public class GCD {
    public static final int MAX_VALUE = 99;
    public static final int MIN_VALUE = 1;

    public static void play() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] gcdData = gcdPrepData();
        Engine.engine(description, gcdData);

    }
    public static String[][] gcdPrepData() {

        String[][] gcdData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
           int randValue1 = Utils.generateNumber(MIN_VALUE,MAX_VALUE);
           int randValue2 = Utils.generateNumber(MIN_VALUE,MAX_VALUE);

            gcdData[questionArray][j] = "" + randValue1 + " " + randValue2;
            gcdData[answerArray][j] = "" + calculateResult(randValue1, randValue2);
        }
        return gcdData;
    }



    public static int calculateResult(int randValue1, int randValue2) {
        BigInteger b1 = BigInteger.valueOf(randValue1);
        BigInteger b2 = BigInteger.valueOf(randValue2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

}





