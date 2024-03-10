package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.math.BigInteger;
import java.util.Random;

public class GCD {
    public static void play() {
        String[] gcdData;
        gcdData = gcdPrepData();
        Engine.engine(gcdData);

    }

    public static String[] gcdPrepData() {
        int randValue1;
        int randValue2;
        int maxValue = 99;
        int result;
        String[] gcdData = new String[8];

        randValue1 = genRandValue(maxValue);
        randValue2 = genRandValue(maxValue);
        result = calculateResult(randValue1, randValue2);
        gcdData[0] = "Find the greatest common divisor of given numbers.";
        gcdData[1] = "Question: " + randValue1 + " " + randValue2;
        gcdData[2] = Integer.toString(result);

        randValue1 = genRandValue(maxValue);
        randValue2 = genRandValue(maxValue);
        result = calculateResult(randValue1, randValue2);
        gcdData[3] = "Question: " + randValue1 + " " + randValue2;
        gcdData[4] = Integer.toString(result);

        randValue1 = genRandValue(maxValue);
        randValue2 = genRandValue(maxValue);
        result = calculateResult(randValue1, randValue2);
        gcdData[5] = "Question: " + randValue1 + " " + randValue2;
        gcdData[6] = Integer.toString(result);
        gcdData[7] = Cli.userName;
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





