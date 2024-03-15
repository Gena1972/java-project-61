package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;


public class App {
    public static final int GREET_ID = 1;
    public static final int EVEN_ID = 2;
    public static final int CALC_ID = 3;
    public static final int GCD_ID = 4;
    public static final int PROGRESSION_ID = 5;
    public static final int PRIME_ID = 6;
    public static final int EXIT_ID = 0;
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice: " + userChoice);
        // scanner.close();

        Cli.greet();
          if (userChoice == EXIT_ID) {
            System.out.println("Exit");
        } else if (userChoice == GREET_ID) {
            } else if (userChoice == EVEN_ID) {
            Even.play();
        } else if (userChoice == CALC_ID) {
          Calc.play();
        } else if (userChoice == GCD_ID) {
           GCD.play();
        } else if (userChoice == PROGRESSION_ID) {
            Progression.play();
        } else if (userChoice == PRIME_ID) {
          Prime.play();
        }
    }

}
