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
        String[] arithSequence = new String[sequenceLength];
        int hiddenNumber;
        String result;
        String[][] progressionData = new String[2][Engine.ROUNDS];

        int questionArray = 0;
        int answerArray = 1;

        for (int j = 0; j < Engine.ROUNDS; j++) {
            stepSequence = genRandValue(maxStepSequence) + minStepValue;
            firstValue = genRandValue(maxFirstValue);
            hiddenNumber = genRandValue(maxStepSequence);
            arithSequence = createArithSequence(firstValue, stepSequence, sequenceLength);
            result = arithSequence[hiddenNumber];
            arithSequence[hiddenNumber] = "..";
            progressionData[questionArray][j] = String.join(" ", arithSequence);
            progressionData[answerArray][j] = "" + result;


        }
        return progressionData;
    }


    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static String[] createArithSequence(int firstValue, int stepSequence, int sequenceLength) {
        String[] arithSequence = new String[sequenceLength];
        arithSequence[0] = "" + firstValue;
        for (int i = 1; i < sequenceLength; i++) {
            arithSequence[i] = "" + (firstValue += stepSequence);
        }
        return arithSequence;
    }
}
