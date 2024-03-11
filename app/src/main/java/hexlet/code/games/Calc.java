package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

import java.util.Random;

public class Calc {
    public static void play (){
        String description = "What is the result of the expression?";
        String[] calcData;
        calcData = calcPrepData();
        Engine.engine(description, calcData);

    }
    public static String[] calcPrepData() {

        int randValue1;
        int randValue2;
        int maxValue = 30;
        char randOperation;
        int result;
        String[] calcData = new String[7];

        for(int i = 0; i < Engine.ROUNDS; i+=2){
            randValue1 = genRandValue(maxValue);
            randValue2 = genRandValue(maxValue);
            randOperation = genRandOperation(randValue1, randValue2);
            result = calculateResult(randValue1, randValue2, randOperation);
            calcData[i] = randValue1 + " " + randOperation + " " + randValue2;
            calcData[i+1] = Integer.toString(result);
        }
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




