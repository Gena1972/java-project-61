package hexlet.code.games;

import hexlet.code.Engine;

public class Game2 {
    // public static int randValue;
    static int game2ID = 2;

    static int randValue;
    static public int maxValue = 1000;
    static String correctAnswer;

    public static void game2() {
        Engine.showTaskMessage("Answer 'yes' if the number is even, otherwise answer 'no'");
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
        correctAnswer = (Engine.taskResult == 0 ? "yes" : "no");
        if (Engine.checkUserAnswer(game2ID, Engine.taskResult, Engine.userAnswer)) {
            System.out.println("Correct!");
            Engine.decRoundCounter();
             } else {
            Engine.wrongEndingGame(Engine.userAnswer, correctAnswer, Engine.userName);
        }
    }

    public static int calculateResult (int randValue) {
        return randValue % 2;
    }

}






