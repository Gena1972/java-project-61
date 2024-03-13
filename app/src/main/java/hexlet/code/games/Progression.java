package hexlet.code.games;



import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] progressionData;
        progressionData = progressionPrepData();
        Engine.engine(description, progressionData);
    }
    public static String[][] progressionPrepData() {

        int stepSequence;
        int maxStepSequence = 9;
        int minStepValue = 1;
        int firstValue;
        int maxFirstValue = 15;
        int sequenceLength = 10;
        int[] arithSequence = new int[sequenceLength];
        int hiddenNumber;
        int result;
        String[][] progressionData = new String[2][Engine.ROUNDS];

        int questionArray = 0;
        int answerArray = 1;

        for (int j = 0; j < Engine.ROUNDS; j++) {
            stepSequence = genRandValue(maxStepSequence) + minStepValue;
            firstValue = genRandValue(maxFirstValue);
            hiddenNumber = genRandValue(maxStepSequence);
            arithSequence = createArithSequence(firstValue, stepSequence, sequenceLength, arithSequence);
            result = calculateResult(hiddenNumber, arithSequence);
            progressionData[questionArray][j] = intArrayToString(arithSequence, hiddenNumber);
            progressionData[answerArray][j] = "" + result;
        }
        return progressionData;
    }



    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static int[] createArithSequence(int firstValue, int stepSequence, int sequenceLength, int[] arithSequence) {
        arithSequence[0] = firstValue;
        for (int i = 1; i < sequenceLength; i++) {
            arithSequence[i] = (firstValue += stepSequence);
        }
        return arithSequence;
    }

    public static int calculateResult(int hiddenNumber, int[] arithSequence) {
        return arithSequence[hiddenNumber];
    }


    public static String intArrayToString(int[] array, int hiddenNumber) {
        String arrayToString = "";
        for (int i = 0; i < array.length; i++) {
            arrayToString += (i == hiddenNumber ? ".." : array[i]) + " ";
        }
        return arrayToString;
    }
}

