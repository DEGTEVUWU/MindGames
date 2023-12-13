package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    public static int value1;
    public static String result;
    public static int index;

    public int getValue1() {
        return this.value1;
    }
    public String getResult() {
        return this.result;
    }
    public  int getIndex() {
        return this.index;
    }

    public static String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static int question() {
         //Random rnd = new Random(System.currentTimeMillis());
        value1 = Utils.generateNumber(1, 600); //rnd.nextInt(600);
        return value1;
    }

    public static String result() {
        index = 0;
        for (var y = 1; y <= value1; y++) {
            if (value1 % y == 0) {
                index += 1;
            }
        }
        if (index <= 2) {
            result = "yes";
        }
        if (index > 2) {
            result = "no";
        }
        return result;
    }

    public static void prime() {
        String[] question = new String[Engine.ROUNDS];
        String[] result = new String[Engine.ROUNDS];
        int index = 0;
        while(index < Engine.ROUNDS) {
            question[index] = String.valueOf(question());
            result[index] = result();
            index++;
        }
        Engine.communication(DESCRIPTION, question, result);
    }

        /*
        Engine.comunication();

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int value1 = random.nextInt(600);

            for (var y = 1; y < value1 / 2; y++) {
                if (value1 % y == 0) {
                    Engine.index += 1;
                }
            }
            String result = "yes";
            if (Engine.index > 2) {
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

         */
}