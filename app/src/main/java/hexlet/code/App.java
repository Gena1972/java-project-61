package hexlet.code;

import hexlet.code.games.Game2;
import hexlet.code.games.Game3;
import hexlet.code.games.Game4;
import hexlet.code.games.Game5;
import hexlet.code.games.Game6;

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


        userChoice = Engine.getUserChoice();
        if (userChoice == 0) {
            System.out.println("Exit");
        } else if (userChoice == 1) {
            Engine.showGreeting();
        } else if (userChoice == 2) {
            Engine.showGreeting();
            Game2.game2();
        } else if (userChoice == 3) {
            Engine.showGreeting();
            Game3.game3();
        } else if (userChoice == 4) {
            Engine.showGreeting();
            Game4.game4();
        } else if (userChoice == 5) {
            Engine.showGreeting();
            Game5.game5();
        } else if (userChoice == 6) {
            Engine.showGreeting();
            Game6.game6();
        }
    }
}