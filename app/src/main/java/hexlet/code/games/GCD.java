package hexlet.code.games;

import hexlet.code.Engine;
import java.math.BigInteger;
import java.util.Random;

public class GCD {
    public static final int MAXVALUE = 99;

    public static void play() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] gcdData;
        gcdData = gcdPrepData();
        Engine.engine(description, gcdData);

    }

    public static String[][] gcdPrepData() {
        int randValue1;
        int randValue2;

        String[][] gcdData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            randValue1 = genRandValue(MAXVALUE);
            randValue2 = genRandValue(MAXVALUE);

            gcdData[questionArray][j] = "" + randValue1 + " " + randValue2;
            gcdData[answerArray][j] = "" + calculateResult(randValue1, randValue2);
        }
        return gcdData;
    }


    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static int calculateResult(int randValue1, int randValue2) {
        BigInteger b1 = BigInteger.valueOf(randValue1);
        BigInteger b2 = BigInteger.valueOf(randValue2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

}





