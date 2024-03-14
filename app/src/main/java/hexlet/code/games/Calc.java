package hexlet.code.games;

import hexlet.code.Engine;


import java.util.Random;

public class Calc {
    public static final int MAXVALUE = 30;
    public static final int COUNTOFOPERATION = 3;
    public static void play() {
        String description = "What is the result of the expression?";
        String[][] calcData;
        calcData = calcPrepData();
        Engine.engine(description, calcData);

    }
    public static String[][] calcPrepData() {

        int randValue1;
        int randValue2;
        char randOperation;
        int result;

        String[][] calcData = new String[2][Engine.ROUNDS];
        int questionArray = 0;
        int answerArray = 1;
        for (int j = 0; j < Engine.ROUNDS; j++) {
            randValue1 = genRandValue(MAXVALUE);
            randValue2 = genRandValue(MAXVALUE);
            randOperation = genRandOperation(randValue1, randValue2);
            calcData[questionArray][j] = "" + randValue1 + " " + randOperation + " " + randValue2;
            calcData[answerArray][j] = "" + calculateResult(randValue1, randValue2, randOperation);;
        }
        return calcData;
    }

    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static char genRandOperation(int randValue1, int randValue2) {
        int randOperationValue = (randValue1 + randValue2) % COUNTOFOPERATION;
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




