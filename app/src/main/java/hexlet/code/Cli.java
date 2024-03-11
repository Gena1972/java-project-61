package hexlet.code;

import java.util.Scanner;
public class Cli {

    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}


/*
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
*/

