package hexlet.code.Games;

import hexlet.code.Engine;

//import java.util.Random;
//import java.util.Scanner;

public class GCD {
    public static void divide() {
        Engine.comunication();
        Engine.userName = Engine.scanner.next();
        System.out.println("Hello, " + Engine.userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");


        for (var i = 0; i < 3; i++) {
            //Random random = new Random();
            int value1 = Engine.random.nextInt(200);
            int value2 = Engine.random.nextInt(200);
            String term = value1 + " " + value2;
            System.out.println("Question: " + term);

            System.out.print("Your answer: ");
            //Scanner scanner1 = new Scanner(System.in);
            String answer = Engine.scanner.next();

            for (int y = 1; y <= value1 && y <= value2; y++) {
                if (value1 % y == 0 && value2 % y == 0) {
                    Engine.sum = y;
                }
            }
            String result = Integer.toString(Engine.sum);

            if (answer.equals(result)) {
                System.out.println("Correct!");
                //System.out.println(Engine.hello());
            } else {
                System.out.println(answer + Engine.wrong + result);
                System.out.println(Engine.wrong2 + Engine.userName);
                break;
            }
            Engine.raunds++;
        }
        if (Engine.raunds == 3) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
}
