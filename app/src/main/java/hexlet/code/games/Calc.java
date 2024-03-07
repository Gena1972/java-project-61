package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;

public class Calc {
    public static String[] calcPrepData() {
        int randValue1;
        int randValue2;
        int maxValue = 30;
        char randOperation;
        int result;
        String[] calcData = new String[6];

        randValue1 = genRandValue(maxValue);
        randValue2 = genRandValue(maxValue);
        randOperation = genRandOperation(randValue1, randValue2);
        result = calculateResult(randValue1, randValue2, randOperation);
        calcData[0] = "What is the result of the expression?";
        calcData[1] = "Question: " + randValue1 + " " + randOperation + " " + randValue2;
        calcData[2] = Integer.toString(result);

        randValue1 = genRandValue(maxValue);
        randValue2 = genRandValue(maxValue);
        randOperation = genRandOperation(randValue1, randValue2);
        result = calculateResult(randValue1, randValue2, randOperation);
        calcData[3] = "Question: " + randValue1 + " " + randOperation + " " + randValue2;
        calcData[4] = Integer.toString(result);

        randValue1 = genRandValue(maxValue);
        randValue2 = genRandValue(maxValue);
        randOperation = genRandOperation(randValue1, randValue2);
        calcData[5] = "Question: " + randValue1 + " " + randOperation + " " + randValue2;
        calcData[6] = Integer.toString(result);

        return calcData;
    }


    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static char genRandOperation(int randValue1, int randValue2) {
        int randOperationValue = (randValue1 + randValue2) % 3;
        char[] operationArray = {'+', '-', '*'};
        return operationArray[randOperationValue];
    }

    public static int calculateResult(int randValue1, int randValue2, char randOperation) {
        if (randOperation == '+') {
            return randValue1 + randValue2;
        } else if (randOperation == '-') {
            return randValue1 - randValue2;
        } else if (randOperation == '*') {
            return randValue1 * randValue2;
        }
        return 0;
    }
}
/*
    static public int game3ID = 3;
    static int randValue1;
    static int randValue2;
    static int maxValue = 30;
    static public char randOperation;

    public static void Calc() {
        Engine.showTaskMessage("What is the result of the expression?");
        while (Engine.roundCounter > 0) {
            playRound(maxValue);
        }
        Engine.correctEndingGame(Cli.userName);
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
            Engine.wrongEndingGame(Engine.userAnswer, Engine.taskResult, Cli.userName);
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
*/




