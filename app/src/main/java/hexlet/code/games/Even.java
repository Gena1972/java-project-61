package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;

public class Even {
    public static String[] evenPrepData() {
        int randValue;
        int maxValue = 1000;
        String result;
        String[] evenData = new String[6];

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
    /*// public static int randValue;
    static int game2ID = 2;

    static int randValue;
    static public int maxValue = 1000;
    static String correctAnswer;

    public static void Even() {
        Engine.showTaskMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.roundCounter > 0) {
            playRound(maxValue);
        }
        Engine.correctEndingGame(Cli.userName);
    }

    public static void playRound(int maxValue) {

        randValue = Engine.genRandValue(maxValue);
        Engine.showTaskQuestion("Question: " + randValue);

        Engine.userAnswer = Engine.getUserAnswer();
        Engine.showUserAnswer("Your answer: " + Engine.userAnswer);
        Engine.taskResult = calculateResult(randValue);
        correctAnswer = (Engine.taskResult == 0 ? "yes" : "no");
        if (Engine.checkUserAnswer(game2ID, Engine.taskResult, Engine.userAnswer)) {
            System.out.println("Correct!");
            Engine.decRoundCounter();
        } else {
            Engine.wrongEndingGame(Engine.userAnswer, correctAnswer, Cli.userName);
        }
    }

    public static int calculateResult(int randValue) {
        return randValue % 2;
    }

} */






