package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;


public class App {
    public static final int GREETID = 1;
    public static final int EVENID = 2;
    public static final int CALCID = 3;
    public static final int GCDID = 4;
    public static final int PROGRESSIONID = 5;
    public static final int PRIMEID = 6;
    public static final int EXITID = 0;
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
        if (userChoice == EXITID) {
            System.out.println("Exit");
        } else if (userChoice == GREETID) {
            Cli.greet();
        } else if (userChoice == EVENID) {
            Cli.greet();
            Even.play();
        } else if (userChoice == CALCID) {
            Cli.greet();
            Calc.play();
        } else if (userChoice == GCDID) {
            Cli.greet();
            GCD.play();
        } else if (userChoice == PROGRESSIONID) {
            Cli.greet();
            Progression.play();
        } else if (userChoice == PRIMEID) {
            Cli.greet();
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
