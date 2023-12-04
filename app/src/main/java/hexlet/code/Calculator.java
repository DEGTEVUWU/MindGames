package hexlet.code;
import java.util.Random;
//import java.lang.Integer;
import java.util.Scanner;
public class Calculator {
    public static void calculate() {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        String wrongAnswer = " is wrong answer ;(. Correct answer was ";
        String wrongAnswer2srting = "Let's try again, ";
        String[] operators = {"+", "-", "*"};
        int result = 0;

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int indexOperators = random.nextInt(2);
            int value1 = random.nextInt(200);
            int value2 = random.nextInt(200);
            String term = value1 + " " + operators[indexOperators] + " " + value2;
            System.out.println("Question: " + term);

            switch (operators[indexOperators]) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                default:
                    break;
            }

            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer1 = scanner1.next();

            if (result == Integer.parseInt(answer1)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer1 + wrongAnswer + result);
                System.out.println(wrongAnswer2srting + userName);
                break;
            }
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
