package hexlet.code;

//DEBUG import java.util.Arrays;

import java.util.Scanner;


public class Engine {
    public static final int ROUNDS = 3;

    public static void engine(String description, String[][] gameData) {
        int questionArray = 0;
        int answerArray = 1;
        Scanner scanner = new Scanner(System.in);

  //DEBUG     System.out.println(Arrays.deepToString(gameData));

        System.out.println(description);
        for (int i = 0; i < Engine.ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][questionArray]);
            String userAnswer = scanner.nextLine();
            if (gameData[i][answerArray].equals(userAnswer)) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + gameData[i][answerArray]+ "'");
                String userName = scanner.next();
                System.out.println("Let's try again, " + userName + "!");
                return;
            }


        }
        String userName = scanner.next();
        System.out.println("Congratulations, " + userName + "!");
    }
}

