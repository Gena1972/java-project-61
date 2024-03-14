package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static final int MAXFIRSTVALUE = 15;
    public static final int MINSTEPVALUE = 1;
    public static final int SEQUENCELENGTH = 10;
    public static final int MAXSTEPSEQUENCE = 9;
    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] progressionData;
        progressionData = progressionPrepData();
        Engine.engine(description, progressionData);
    }

    public static String[][] progressionPrepData() {

        int stepSequence;
        int firstValue;
        int hiddenNumber;
        String result;
        String[] arithSequence;
        String[][] progressionData = new String[2][Engine.ROUNDS];

        int questionArray = 0;
        int answerArray = 1;

        for (int j = 0; j < Engine.ROUNDS; j++) {
            stepSequence = genRandValue(MAXSTEPSEQUENCE) + MINSTEPVALUE;
            firstValue = genRandValue(MAXFIRSTVALUE);
            hiddenNumber = genRandValue(MAXSTEPSEQUENCE);
            arithSequence = createArithSequence(firstValue, stepSequence, SEQUENCELENGTH);
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
