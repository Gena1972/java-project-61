package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;

public class Calc {
    public static void play (){
        String[] calcData;
        calcData = calcPrepData();
        Engine.engine(calcData);

    }
    public static String[] calcPrepData() {
        int randValue1;
        int randValue2;
        int maxValue = 30;
        char randOperation;
        int result;
        String[] calcData = new String[8];

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
        result = calculateResult(randValue1, randValue2, randOperation);
        calcData[5] = "Question: " + randValue1 + " " + randOperation + " " + randValue2;
        calcData[6] = Integer.toString(result);
        calcData[7] = Cli.userName;

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




