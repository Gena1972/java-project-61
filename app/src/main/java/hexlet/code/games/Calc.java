package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int MAX_VALUE = 30;
    public static final int MIN_VALUE = 1;
    public static final int COUNT_OF_OPERATION = 3;

    public static void play() {
        String description = "What is the result of the expression?";
        String[][] calcData = calcPrepData();
        Engine.engine(description, calcData);

    }

    public static String[][] calcPrepData() {
        String[][] calcData = new String[Engine.ROUNDS][2];
        int questionArray = 0;
        int answerArray = 1;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randValue1 = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            int randValue2 = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            char randOperation = genRandOperation(randValue1, randValue2);
            calcData[i][questionArray] = "" + randValue1 + " " + randOperation + " " + randValue2;
            calcData[i][answerArray] = "" + calculateResult(randValue1, randValue2, randOperation);

        }
        return calcData;
    }
   /* public static String[][] calcPrepData() {

       String[][] calcData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
           int randValue1 = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
           int randValue2 = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
           char randOperation = genRandOperation(randValue1, randValue2);
            calcData[questionArray][j] = "" + randValue1 + " " + randOperation + " " + randValue2;
            calcData[answerArray][j] = "" + calculateResult(randValue1, randValue2, randOperation);

        }

        return calcData;
    }*/

    public static char genRandOperation(int randValue1, int randValue2) {
        int randOperationValue = (randValue1 + randValue2) % COUNT_OF_OPERATION;
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
        throw new RuntimeException("Unknown operator: " + randOperation);
    }
}




