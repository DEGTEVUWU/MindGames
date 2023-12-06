package hexlet.code.Games;
import hexlet.code.Engine;

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
        String[] operators = {"+", "-", "*"};


        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int indexOperators = random.nextInt(2);
            int value1 = random.nextInt(200);
            int value2 = random.nextInt(200);
            String term = value1 + " " + operators[indexOperators] + " " + value2;
            System.out.println("Question: " + term);

            switch (operators[indexOperators]) {
                case "+":
                    Engine.sum = value1 + value2;
                    break;
                case "-":
                    Engine.sum = value1 - value2;
                    break;
                case "*":
                    Engine.sum = value1 * value2;
                    break;
                default:
                    break;
            }

            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.next();

            String result = Integer.toString(Engine.sum);

            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + Engine.wrong + result);
                System.out.println(Engine.wrong2 + userName);
                break;
            }
            Engine.raunds++;
        }
        if (Engine.raunds == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
