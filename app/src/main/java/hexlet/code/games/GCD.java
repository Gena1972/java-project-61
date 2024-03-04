package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.math.BigInteger;

public class GCD {
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




