package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calculator {
    public static int value1;
    public static int value2;
    public static int indexOperators;
    public int getValue1() {
        return this.value1;
    }
    public int getValue2() {
        return this.value1;
    }
    public int getIndexOperators() {
        return this.value1;
    }

    public static final String DESCRIPTION  = "What is the result of the expression?";

    public static String question() {
        //Random rnd = new Random(System.currentTimeMillis());
        value1 = Utils.generateNumber(1, 200); //rnd.nextInt(200);
        value2 = Utils.generateNumber(1, 200); //rnd.nextInt(200);
        indexOperators = Utils.generateNumber(0, 2);//rnd.nextInt(3);
        String[] operators = {"+", "-", "*"};
        return value1 + " " + operators[indexOperators] + " " + value2;
    }

    public static int result() {

        if (indexOperators == 0) {
            Engine.sum = value1 + value2;
        }
        if (indexOperators == 1) {
            Engine.sum = value1 - value2;
        }
        if (indexOperators == 2) {
            Engine.sum = value1 * value2;
        }
        return Engine.sum;

    }




    public static void calculate() {
        /*
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};


         */

        /*for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int indexOperators = random.nextInt(2);
            int value1 = random.nextInt(200);
            int value2 = random.nextInt(200);
            String term = value1 + " " + operators[indexOperators] + " " + value2;
            System.out.println("Question: " + term);


         */
        /*
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

         */
    }
}
