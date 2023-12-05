package hexlet.code;
import hexlet.code.Games.Calculator;
import hexlet.code.Games.GCD;
import hexlet.code.Games.ParityCheck;
import hexlet.code.Games.Progression;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scan.next();
        if (userChoice.equals("1")) {
            Cli.console();
        }
        if (userChoice.equals("2")) {
            ParityCheck.check();
        }
        if (userChoice.equals("3")) {
            Calculator.calculate();
        }
        if (userChoice.equals("4")) {
            GCD.divide();
        }
        if (userChoice.equals("5")) {
            Progression.progression();
        }




    }
}
