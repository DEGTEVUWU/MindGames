package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scan.next();
        if(userChoice.equals("1")) {
            Cli.console();
        }
        //Choice.choice();



        //System.out.println("Welcome to the Brain Games!");
        //Cli.console();
    }
}
