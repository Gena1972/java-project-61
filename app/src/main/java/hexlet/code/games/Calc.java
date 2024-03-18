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
            char[] operationArray = {'+', '-', '*'};
            char randOperation = operationArray[(randValue1 + randValue2) % COUNT_OF_OPERATION];
            calcData[i][questionArray] = "" + randValue1 + " " + randOperation + " " + randValue2;
            calcData[i][answerArray] = "" + calculateResult(randValue1, randValue2, randOperation);

        }
        return calcData;
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




