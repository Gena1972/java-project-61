package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class Progression {
    public static void progressionPrepData() {

        int stepSequence;
        int maxStepSequence = 9;
        int minStepValue = 1;
        int firstValue;
        int maxFirstValue = 15;
        int sequenceLength = 10;
        int hiddenNumber;
        String[] progressionData = String new [6];

        stepSequence = genRandValue(maxStepSequence) + minStepValue;
        firstValue = genRandValue(maxFirstValue);
        hiddenNumber = genRandValue(maxStepSequence);
        int[] arithSequence = new int[sequenceLength];

        progressionData[0] = "What number is missing in the progression?";
        progressionData[1] = "Question: " + randValue1 + " " + randValue2;
        progressionData[2] = Integer.toString(result);
    }

    /*
    public static void Progression() {
        Engine.showTaskMessage("What number is missing in the progression?");
        while (Engine.roundCounter > 0) {
            playRound();
        }
        Engine.correctEndingGame(Cli.userName);
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
            Engine.wrongEndingGame(Engine.userAnswer, Engine.taskResult, Cli.userName);
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

