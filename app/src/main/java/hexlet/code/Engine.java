package hexlet.code;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Prime;
import hexlet.code.Games.ParityCheck;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Calculator;
public class Engine {
    public static final int ROUNDS = 3;
    public static App ch = new App();
    public static String question;
    public static String result;
    public static String greeting;

    public static int index;
    public static int sum;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static String userName;
    public static String wrong = " is wrong answer ;(. Correct answer was ";
    public static String wrong2 = "Let's try again, ";
    public static int rounds;

    public static void communication(String DESCRIPTION, String[] question, String[] result) {

        String choice = ch.getChoice();

        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        /*
        for (var i = 0; i < 3; i++) {
            if (choice.equals("2")) {
                greeting = ParityCheck.DESCRIPTION ;
                question = Integer.toString(ParityCheck.question());
                result = ParityCheck.result();
            }
            if (choice.equals("3")) {
                greeting = Calculator.DESCRIPTION ;
                question = Calculator.question();
                result = Integer.toString(Calculator.result());
            }
            if (choice.equals("4")) {
                greeting = GCD.DESCRIPTION ;
                question = GCD.question();
                result = Integer.toString(GCD.result());
            }
            if (App.choice.equals("5")) {
                greeting = Progression.DESCRIPTION ;
                question = Progression.question();
                result = Progression.result();
            }
            if (App.choice.equals("6")) {
                greeting = Prime.DESCRIPTION ;
                question = Integer.toString(Prime.question());
                result = Prime.result();
            }
            if (rounds == 0) {
                System.out.println(greeting);
            }

         */
        while (rounds < Engine.ROUNDS){
            if (rounds == 0) {
                System.out.println(DESCRIPTION);
            }

            System.out.println("Question: " + question[rounds]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(result[rounds])) {
                System.out.println("Correct!");
                rounds++;
            } else {
                System.out.println("'" + answer + "'" + wrong + "'" + result[rounds] + "'");
                System.out.println(wrong2 + userName);
                break;
            }

        }

        if (rounds == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

