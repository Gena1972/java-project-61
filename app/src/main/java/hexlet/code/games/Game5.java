package hexlet.code.games;

import hexlet.code.Engine;

public class Game5 {
    static public int game5ID = 5;
    static int stepSequence;
    static public int maxStepSequence = 9;
    static public int minStepValue = 1;
    static public int firstValue;
    static public int maxFirstValue = 15;
    static public int sequenceLength = 10;
    static public int hiddenNumber;
    static public String taskQuestionString;

    public static void game5() {
        Engine.showTaskMessage("What number is missing in the progression?");
        while (Engine.roundCounter > 0) {
            playRound();
        }
        Engine.correctEndingGame(Engine.userName);
    }

    public static void playRound() {
        stepSequence = Engine.genRandValue(maxStepSequence) + minStepValue;
        firstValue = Engine.genRandValue(maxFirstValue);
        hiddenNumber = Engine.genRandValue(maxStepSequence);
        int[] arithSequence = new int[sequenceLength];
        arithSequence = createArithSequence(sequenceLength, arithSequence);

        Engine.taskResult = calculateResult(hiddenNumber, arithSequence);
        taskQuestionString = createTaskQuestionStr(arithSequence);
        Engine.showTaskMessage(taskQuestionString);
        Engine.userAnswer = Engine.getUserAnswer();
        Engine.showUserAnswer("Your answer: " + Engine.userAnswer);
        Engine.taskResult = calculateResult(hiddenNumber, arithSequence);
        if (Engine.checkUserAnswer(game5ID, Engine.taskResult, Engine.userAnswer)) {
            System.out.println("Correct!");
            Engine.decRoundCounter();
        } else {
            Engine.wrongEndingGame(Engine.userAnswer, Engine.taskResult, Engine.userName);
        }
    }


    public static int[] createArithSequence(int sequenceLength, int[] arithSequence) {
        arithSequence[0] = firstValue;
        for (int i = 1; i < sequenceLength; i++) {
            arithSequence[i] = firstValue += stepSequence;
        }
        return arithSequence;
    }

    public static int calculateResult(int hiddenNumber, int[] arithSequence) {
        return arithSequence[hiddenNumber];
    }

    public static String createTaskQuestionStr(int[] sequence) {
        String newString = "Question: ";
        for (int i = 0; i < sequenceLength; i++) {
            newString += (i == hiddenNumber ? ".." : sequence[i]);
            newString += " ";

        }
        return newString;
    }
}

