package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;

public class Even {
    public static void play (){
        String[] evenData;
        evenData = evenPrepData();
        Engine.engine(evenData);

    }
    public static String[] evenPrepData() {
        int randValue;
        int maxValue = 1000;
        String result;
        String[] evenData = new String[8];

        randValue = genRandValue(maxValue);
        result = calculateResult(randValue);
        evenData[0] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        evenData[1] = "Question: " + randValue;
        evenData[2] = result;

        randValue = genRandValue(maxValue);
        result = calculateResult(randValue);
        evenData[3] = "Question: " + randValue;
        evenData[4] = result;

        randValue = genRandValue(maxValue);
        result = calculateResult(randValue);
        evenData[5] = "Question: " + randValue;
        evenData[6] = result;
        evenData[7] = Cli.userName;
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
