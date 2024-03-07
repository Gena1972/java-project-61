package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.math.BigInteger;
import java.util.Random;

public class GCD {
    public static String[] gcdPrepData() {
        int randValue1;
        int randValue2;
        int maxValue = 99;
        char randOperation;
        int result;
        String[] gcdData = new String[6];

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

   /*
            "Find the greatest common divisor of given numbers.",
            "Question: ",
            "Your answer: ",
            "is wrong answer ;(. Correct answer was ",
            "Let's try again,",
            "Correct!",
            "Congratulations, "

    */

}

    /*
    static public int game4ID = 4;
    static int randValue1;
    static int randValue2;
    static int maxValue = 99;

    public static void GCD() {

        Engine.showTaskMessage("Find the greatest common divisor of given numbers.");
        while (Engine.roundCounter > 0) {
            playRound(maxValue);
        }
        Engine.correctEndingGame(Cli.userName);
    }

    public static void playRound(int maxValue) {
        randValue1 = Engine.genRandValue(maxValue);
        randValue2 = Engine.genRandValue(maxValue);
        Engine.showTaskQuestion("Question: " + randValue1 + "  " + randValue2);
        Engine.userAnswer = Engine.getUserAnswer();
        Engine.showUserAnswer("Your answer: " + Engine.userAnswer);
        Engine.taskResult = calculateResult(randValue1, randValue2);

        if (Engine.checkUserAnswer(game4ID, Engine.taskResult, Engine.userAnswer)) {
            System.out.println("Correct!");
            Engine.decRoundCounter();
        } else {
            Engine.wrongEndingGame(Engine.userAnswer, Engine.taskResult, Cli.userName);
        }
    }

    public static int calculateResult(int randValue1, int randValue2) {
        BigInteger b1 = BigInteger.valueOf(randValue1);
        BigInteger b2 = BigInteger.valueOf(randValue2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

}
*/





