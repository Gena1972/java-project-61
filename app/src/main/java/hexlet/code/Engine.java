package hexlet.code;

//import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;


public class Engine {

    public static void engine(String gameData[]) {

        //   System.out.println(Arrays.toString(gameData));
        // Elements of gameData array
        int mainQuestion = 0;
        int questionOfRound1 = 1;
        int answerOfRound1 = 2;
        int questionOfRound2 = 3;
        int answerOfRound2 = 4;
        int questionOfRound3 = 5;
        int answerOfRound3 = 6;
        int userName = 7;

        System.out.println(gameData[mainQuestion]);
        System.out.println(gameData[questionOfRound1]);
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        if (gameData[answerOfRound1].equals(userAnswer)) {
            System.out.println("Your answer: " + userAnswer);
            System.out.println("Correct!");
            System.out.println(gameData[questionOfRound2]);
            scanner = new Scanner(System.in);
            userAnswer = scanner.nextLine();
        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. CCorrect answer was " + "'" + gameData[answerOfRound1]  + "'" +"\n" +
                    "Let's try again, " + gameData[userName] + "!");
            System.exit(0);
        }
        if (gameData[answerOfRound2].equals(userAnswer)) {
            System.out.println("Your answer: " + userAnswer);
            System.out.println("Correct!");
            System.out.println(gameData[questionOfRound3]);
            scanner = new Scanner(System.in);
            userAnswer = scanner.nextLine();
        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameData[answerOfRound2] + "'" + "\n" +
                    "Let's try again, " + gameData[userName] + "!");
            System.exit(0);
        }
        if (gameData[answerOfRound3].equals(userAnswer)) {
            System.out.println("Your answer: " + userAnswer);
            System.out.println("Correct!");
            System.out.println("Congratulations, " + gameData[userName]);


        } else {
            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameData[answerOfRound3] + "'" + "\n" +
                    "Let's try again, " + gameData[userName] + "!");
            System.exit(0);
        }
    }
}

