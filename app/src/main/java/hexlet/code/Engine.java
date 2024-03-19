package hexlet.code;
//DEBUG import java.util.Arrays;
import java.util.Scanner;


public class Engine {
    public static final int ROUNDS = 3;
    public static void engine(String description, String[][] gameData) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner1.next();
        System.out.println("Hello, " + userName + "!");

        //DEBUG     System.out.println(Arrays.deepToString(gameData));

        System.out.println(description);
        Scanner scanner2 = new Scanner(System.in);
        for (String[] line : gameData) {
            System.out.println("Question: " + line[0]);
            String userAnswer = scanner2.nextLine();
            if (line[1].equals(userAnswer)) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + line[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}


