package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Engine {
    public static int index = 0;
    public static int sum = 0;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static String userName;
    public static String wrong = " is wrong answer ;(. Correct answer was ";
    public static String wrong2 = "Let's try again, ";
    public static int raunds = 0;

    public static void   comunication() {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        //Scanner scanner = new Scanner(System.in);
        //String userName = scanner.next();
        //System.out.println("Hello, " + userName + "!");
        //System.out.println("Hello, " + userName + "!");
    }

}
