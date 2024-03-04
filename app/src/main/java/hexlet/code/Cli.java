package hexlet.code;

import java.util.Scanner;

public class Cli {
    static public String userName;
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

}


