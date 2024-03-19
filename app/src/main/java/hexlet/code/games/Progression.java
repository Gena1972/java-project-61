package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    public static final int MAX_FIRST_VALUE = 15;
    public static final int MIN_FIRST_VALUE = 1;
    public static final int MAX_STEP_VALUE = 9;
    public static final int MIN_STEP_VALUE = 1;
    public static final int MIN_HIDDEN_VALUE = 1;
    public static final int MAX_HIDDEN_VALUE = 9;

    public static final int SEQUENCE_LENGTH = 10;

    public static void play() {
        String description = "What number is missing in the progression?";
        String[][] progressionData = progressionPrepData();
        Engine.engine(description, progressionData);
    }

    public static String[][] progressionPrepData() {
        String[][] progressionData = new String[Engine.ROUNDS][2];
        int questionArray = 0;
        int answerArray = 1;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstValue = Utils.generateNumber(MIN_FIRST_VALUE, MAX_FIRST_VALUE);
            int stepValue = Utils.generateNumber(MIN_STEP_VALUE, MAX_STEP_VALUE);
            int hiddenNumber = Utils.generateNumber(MIN_HIDDEN_VALUE, MAX_HIDDEN_VALUE);
            String[] arithSequence = createArithSequence(firstValue, stepValue, SEQUENCE_LENGTH);
            String result = arithSequence[hiddenNumber];
            arithSequence[hiddenNumber] = "..";
            progressionData[i][questionArray] = String.join(" ", arithSequence);
            progressionData[i][answerArray] = result;
        }
        return progressionData;
    }

    public static String[] createArithSequence(int firstValue, int stepSequence, int sequenceLength) {
        String[] arithSequence = new String[sequenceLength];
        arithSequence[0] = "" + firstValue;
        for (int i = 1; i < sequenceLength; i++) {
            firstValue += stepSequence;
            arithSequence[i] = "" + (firstValue);
        }
        return arithSequence;
    }
}
