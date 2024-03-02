package hexlet.code.games;

import hexlet.code.Engine;

public class Game3 {
    static public int game3ID = 3;
    static int randValue1;
    static int randValue2;
    static int maxValue = 30;
    static public char randOperation;

    public static void game3() {
        Engine.showTaskMessage("What is the result of the expression?");
        while (Engine.roundCounter > 0) {
            playRound(maxValue);
        }
        Engine.correctEndingGame(Engine.userName);
    }


    public static void playRound(int maxValue) {
        randValue1 = Engine.genRandValue(maxValue);
        randValue2 = Engine.genRandValue(maxValue);
        randOperation = genRandOperation(randValue1, randValue2);
        Engine.showTaskQuestion("Question: " + randValue1 + " " + randOperation + " " + randValue2);
        Engine.userAnswer = Engine.getUserAnswer();
        Engine.showUserAnswer("Your answer: " + Engine.userAnswer);
        Engine.taskResult = calculateResult(randValue1, randValue2);

        if (Engine.checkUserAnswer(game3ID, Engine.taskResult, Engine.userAnswer)) {
            System.out.println("Correct!");
            Engine.decRoundCounter();
        } else {
            Engine.wrongEndingGame(Engine.userAnswer, Engine.taskResult, Engine.userName);
        }
    }


    public static int calculateResult(int randValue1, int randValue2) {
        if (randOperation == '+') {
            return randValue1 + randValue2;
        } else if (randOperation == '-') {
            return randValue1 - randValue2;
        } else if (randOperation == '*') {
            return randValue1 * randValue2;
        }
        return 0;
    }

    public static char genRandOperation(int randValue1, int randValue2) {
        int randOperationValue = (randValue1 + randValue2) % 3;
        char[] operationArray = {'+', '-', '*'};
        return operationArray[randOperationValue];
    }
}





