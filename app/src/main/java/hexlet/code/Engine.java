package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {

    static public int roundCounter = 3;
    static public String userName;

    static public String userAnswer;

    static public int taskResult;

    //static public String correctAnswer = "" + taskResult;

    //static public boolean checkUserAnswer = true;


    public static void decRoundCounter() {
        roundCounter--;
    }

    public static void showGreeting() {
        System.out.println();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = getUserName();

        System.out.println("Hello, " + userName + "!");
        // scanner.close();
    }

    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        // scanner.close();
        return scanner.nextLine();
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();
        System.out.println("Your choice: " + userValue);
        // scanner.close();
        return userValue;
    }

    public static int genRandValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);

        //scanner.close();
        return scanner.nextLine();
    }

    //shows 1 time
    public static void showTaskMessage(String str) {
        System.out.println(str);
    }

    //shows 3 time (every round)
    public static void showTaskQuestion(String str) {
        System.out.println(str);
    }

    public static void showUserAnswer(String str) {
        System.out.println(str);
    }


    public static boolean checkUserAnswer(int gameID, int taskResult, String userAnswer) {
        if (gameID == 2) {
            return ((taskResult == 0) && userAnswer.equals("yes") ||
                    (!(taskResult == 0) && userAnswer.equals("no")));
        } else if (gameID == 3 || gameID == 4 || gameID == 5) {
            return (taskResult == Integer.parseInt(userAnswer));
        } else if (gameID == 6) {
            return (taskResult >= 0) && userAnswer.equals("yes") ||
                    (taskResult < 0) && userAnswer.equals("no");
        }
        return false;
    }


    public static void wrongEndingGame(String userAnswer, String correctAnswer, String userName) {
        System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public static void wrongEndingGame(String userAnswer, int taskResult, String userName) {
        System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was " + "'" + taskResult + "'");
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public static void correctEndingGame(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static boolean isEven(int randValue) {
        return randValue % 2 == 0;
    }

}