package hexlet.code.Games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class ParityCheck {
    public static int value1;

    public int getValue1() {
        return this.value1;
    }
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static int question() {
        value1 = Utils.generateNumber(1, 200);
        return value1;
    }

    /*public static String result() {
        String result;
        if (value1 % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }

     */

    public static boolean isResult() {
        if (value1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void check() {
        String[] question = new String[Engine.ROUNDS];
        String[] result = new String[Engine.ROUNDS];
        int index = 0;
        while (index < Engine.ROUNDS) {
            question[index] = String.valueOf(question());
            if (isResult()) {
                result[index] = "yes";
            }
            else {
                result[index] = "no";
            }

            //if (Integer.parseInt(question[index]) % 2 == 0) {
            //    result[index] = "yes";
            //} else {
            //    result[index] = "no";
            //}
            index++;
        }
        Engine.communication(DESCRIPTION, question, result);
/*
        String[] result = new String[Engine.ROUNDS];
        int index2 = 0;
        while (index2 < Engine.ROUNDS) {
            if (Integer.parseInt(question[index2]) % 2 == 0) {
                result[index2] = "yes";
            } else {
                result[index2] = "no";
            }
            index2++;
        }


 */



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



