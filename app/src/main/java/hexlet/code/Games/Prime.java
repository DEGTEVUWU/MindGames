package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Engine.comunication();

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int value1 = random.nextInt(600);
            int index = 0;

            for (var y = 1; y < value1 / 2; y++) {
                if (value1 % y == 0) {
                    index += 1;
                }
            }
            String result = "yes";
            if (index > 2) {
                result = "no";
            }

            System.out.println("Question: " + value1);
            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.next();

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
