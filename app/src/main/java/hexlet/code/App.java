package hexlet.code;
import java.util.Scanner;
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static String choice;

    public String getChoice() {
        return this.choice;
    }
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

        choice = scanner.next();

        switch (choice) {
            case "1":
                Cli.console();
                break;
            case "2", "3", "4", "5", "6":
                Engine.communication();
                break;
            default:
                break;
        }
        /*

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
        if (userChoice.equals("6")) {
            Prime.prime();
        }

         */
    }
}
