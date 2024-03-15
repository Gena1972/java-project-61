package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    public static final int MAX_FIRST_VALUE = 15;
    public static final int MIN_FIRST_VALUE = 1;
    public static final int MAX_STEP_VALUE = 9;
    public static final int MIN_STEP_VALUE = 1;
    public static final int SEQUENCE_LENGTH = 10;


    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] progressionData;
        progressionData = progressionPrepData();
        Engine.engine(description, progressionData);
    }

    public static String[][] progressionPrepData() {

        String[][] progressionData = new String[2][Engine.ROUNDS];

        int questionArray = 0;
        int answerArray = 1;

        for (int j = 0; j < Engine.ROUNDS; j++) {
            int stepSequence = Utils.generateNumber(MIN_STEP_VALUE, MAX_STEP_VALUE);
            int firstValue = Utils.generateNumber(MIN_FIRST_VALUE,MAX_FIRST_VALUE);
            int hiddenNumber = Utils.generateNumber(MIN_FIRST_VALUE,MAX_STEP_VALUE);
            String[] arithSequence = createArithSequence(firstValue, stepSequence, SEQUENCE_LENGTH);
            String result = arithSequence[hiddenNumber];
            arithSequence[hiddenNumber] = "..";
            progressionData[questionArray][j] = String.join(" ", arithSequence);
            progressionData[answerArray][j] = "" + result;


        }
        return progressionData;
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
