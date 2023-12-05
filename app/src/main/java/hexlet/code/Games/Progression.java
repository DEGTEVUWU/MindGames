package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Engine.comunication();

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int value1 = random.nextInt(200);
            int value2 = random.nextInt(21);
            int length = random.nextInt(5, 10);
            int swap = random.nextInt(1, length);

            int[] progression = new int[length];

            int index = value1;

            for (var y = 0; y < progression.length; y++) {
                progression[y] = index;
                index += value2;
            }

            String result = Integer.toString(progression[swap]);

            String[] term = Arrays.stream(progression).mapToObj(Integer::toString).toArray(String[]::new);
            term[swap] = "..";
            String termClean = Arrays.toString(term).replace("[", "").replace("]", "").replace(",", "");
            term[swap] = "..";

            System.out.println("Question: " + termClean);

            System.out.print("Your answer: ");
            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.next();

            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + Engine.wrongAnswer + progression[swap]);
                System.out.println(Engine.wrongAnswer2srting + userName);
                break;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

