package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int userChoice;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");


        userChoice = getUserChoice();
        if (userChoice == 0) {
            System.out.println("Exit");
        } else if (userChoice == 1) {
            Cli.showGreeting();
        } else if (userChoice == 2) {
            Cli.showGreeting();
            Even.play();
        } else if (userChoice == 3) {
            Cli.showGreeting();
            Calc.play();
        } else if (userChoice == 4) {
            Cli.showGreeting();
            GCD.play();
        } else if (userChoice == 5) {
            Cli.showGreeting();
            Progression.play();
        } else if (userChoice == 6) {
            Cli.showGreeting();
            Prime.play();
        }
    }
    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();
        System.out.println("Your choice: " + userValue);
        // scanner.close();
        return userValue;
    }
}