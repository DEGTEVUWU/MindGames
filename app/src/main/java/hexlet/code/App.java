package hexlet.code;
import hexlet.code.Games.ParityCheck;
import hexlet.code.Games.Calculator;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;
import java.util.Scanner;
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.next();

        switch (choice) {
            case "1":
                Cli.console();
                break;
            case "2":
                ParityCheck.dataEntry();
                break;
            case "3":
                Calculator.dataEntry();
                break;
            case "4":
                GCD.dataEntry();
                break;
            case "5":
                Progression.dataEntry();
                break;
            case "6":
                Prime.dataEntry();
                break;
            default:
                break;
        }
    }
}
