package hexlet.code.Games;
import java.util.Random;
import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.Engine.*;
public class ParityCheck {
    public static void check() {
        Engine.comunication();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        /*
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

         */

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            Random rnd = new Random(System.currentTimeMillis());
            int number = rnd.nextInt(200);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer1 = scanner1.next();


            //String wrongAnswer = " is wrong answer ;(. Correct answer was ";
            //String wrongAnswer2srting = "Let's try again, ";

            if (number % 2 == 0 && answer1.equals("yes")) {
                System.out.println("Correct!");
            } else if (number % 2 == 1 && answer1.equals("no")) {
                System.out.println("Correct!");
            } else if (number % 2 == 0 && answer1.equals("no")) {
                System.out.println(answer1 + Engine.wrongAnswer + "'yes'.");
                System.out.println(Engine.wrongAnswer2srting + userName);
                break;
            } else if (number % 2 == 1 && answer1.equals("yes")) {
                System.out.println(answer1 + Engine.wrongAnswer + "'no'.");
                System.out.println(Engine.wrongAnswer2srting + userName);
                break;
            } else {
                if (number % 2 == 0) {
                    System.out.println("'" + answer1 + "'" + Engine.wrongAnswer + "'yes'.");
                    System.out.println(Engine.wrongAnswer2srting + userName);
                    break;
                }
                if (number % 2 == 1) {
                    System.out.println("'" + answer1 + "'" + Engine.wrongAnswer + "'no'.");
                    System.out.println(Engine.wrongAnswer2srting + userName);
                    break;
                }
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
