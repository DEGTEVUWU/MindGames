package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int INDEX_RESULT = 1;
    public static final int INDEX_QUESTION = 0;
    public static final int QUESTION_AND_ANSWER = 2;
    public static int rounds = 0;
    public static String wrongAnswer1 = " is wrong answer ;(. Correct answer was ";
    public static String wrongAnswer2 = "Let's try again, ";
    public static void communication(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        for (String[] roundData : roundsData) {
            if (rounds == 0) {
                System.out.println(description);
            }

            System.out.println("Question: " + roundsData[rounds][INDEX_QUESTION]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(roundsData[rounds][INDEX_RESULT])) {
                System.out.println("Correct!");
                rounds++;
            } else {
                System.out.println("'" + answer + "'" + wrongAnswer1 + "'" + roundsData[rounds][INDEX_RESULT] + "'");
                System.out.println(wrongAnswer2 + userName);
                break;
            }
        }

        if (rounds == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

