package hexlet.code.Games;
import java.util.Random;
//import java.util.Scanner;
//import hexlet.code.Engine;

public class ParityCheck {
    public static String greeting = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static int question() {
        Random rnd = new Random(System.currentTimeMillis());
        return rnd.nextInt(200);
    }

    public static String result() {
        String result;
        if (question() % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
    public static void check() {
        //Engine.comunication();
        //Scanner scanner = new Scanner(System.in);
        //String userName = scanner.next();
        //System.out.println("Hello, " + userName + "!");

        //System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        //for (var i = 0; i < 3; i++) {
            //Random rnd = new Random(System.currentTimeMillis());
            //int number = rnd.nextInt(200);
            //System.out.println("Question: " + term());
            //System.out.print("Your answer: ");
            //Scanner scanner1 = new Scanner(System.in);
            //String answer = scanner1.next();

        /*
            String result = new String();
            if (question() % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + Engine.wrong + "'" + result + "'");
                System.out.println(Engine.wrong2 + userName);
                break;
            }

            Engine.raunds++;
        }
        if (Engine.raunds == 3) {
            System.out.println("Congratulations, " + userName + "!");

        }

         */
    }


}
