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

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        /*System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
         */
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Cli.console();
            case "2" -> ParityCheck.dataEntry();
            case "3" -> Calculator.dataEntry();
            case "4" -> GCD.dataEntry();
            case "5" -> Progression.dataEntry();
            case "6" -> Prime.dataEntry();
            //default -> throw new RuntimeException(System.out.println("Unknown choice: " + choice));
            default -> System.out.println("Unknown choice: " + choice);
        }
        scanner.close();
    }
}
