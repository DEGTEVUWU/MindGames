package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even;");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scan.next();
        if(userChoice.equals("1")) {
            Cli.console();
        }
        if(userChoice.equals("2")) {
            Parity_check.check();
        }




    }
}
