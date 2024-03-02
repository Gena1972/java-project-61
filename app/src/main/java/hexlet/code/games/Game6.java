package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Game6 {
    static public int game6ID = 6;
    static public int maxValue = 100;
    static public int randValue;
    static public String correctAnswer;

    static public int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public static void game6() {
        Engine.showTaskMessage("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.roundCounter > 0) {
            playRound(maxValue);
        }
        Engine.correctEndingGame(Engine.userName);
    }

    public static void playRound(int maxValue) {

        randValue = Engine.genRandValue(maxValue);
        Engine.showTaskQuestion("Question: " + randValue);

        Engine.userAnswer = Engine.getUserAnswer();
        Engine.showUserAnswer("Your answer: " + Engine.userAnswer);
        Engine.taskResult = calculateResult(randValue);
        correctAnswer = (Engine.taskResult >= 0 ? "yes" : "no");
        if (Engine.checkUserAnswer(game6ID, Engine.taskResult, Engine.userAnswer)) {
            System.out.println("Correct!");
            Engine.decRoundCounter();
        } else {
            Engine.wrongEndingGame(Engine.userAnswer, correctAnswer, Engine.userName);
        }
}

public static int calculateResult(int randValue){
    return Arrays.binarySearch(primeNumbers, randValue);
    }
}
