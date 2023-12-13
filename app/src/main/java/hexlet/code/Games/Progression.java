package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;


public class Progression {
    public static int first;
    public static int step;
    public static int length;
    public static int swap;
    public static String result;
    public static String[] term;
    public static String answer;
    public static final String DESCRIPTION  = "What number is missing in the progression?";
    public int getValue1() {
        return this.first;
    }
    public int getValue2() {
        return this.step;
    }
    public int getLength() {
        return this.length;
    }
    public int getSwap() {
        return this.swap;
    }
    public String getResult() {
        return this.result;
    }
    public String getAnswer() {
        return  this.answer;
    }
    public static String[] makeProgression(int first, int step, int length) {
        int[] progression = new int[length];
        int index = first;
        for (var y = 0; y < length; y++) {
            progression[y] = index;
            index += step;
        }
        term = Arrays.stream(progression).mapToObj(Integer::toString).toArray(String[]::new);
        return term;
    }
    public static String question() {
        //Random rnd = new Random(System.currentTimeMillis());
        first = Utils.generateNumber(1, 200);
        step = Utils.generateNumber(1, 21);
        length = Utils.generateNumber(5, 10);
        swap = Utils.generateNumber(1, length - 1);

        //int[] progression = new int[length];
        //int index = value1;
        //for (var y = 0; y < length; y++) {
        //    progression[y] = index;
        //    index += value2;
        //}
        //term = Arrays.stream(progression).mapToObj(Integer::toString).toArray(String[]::new);
        String[] progression = makeProgression(first, step, length);
        answer = progression[swap];
        progression[swap] = "..";
        String question = String.join(" ", progression);
        //term[swap] = "..";
        //termClean = Arrays.toString(term).replace("[", "").replace("]", "").replace(",", "");
        //term[swap] = "..";

        return question;

    }
    public static String result() {
        return  answer;
        /*
        int[] progression = new int[length];
        int index = first;
        for (var y = 0; y < length; y++) {
            progression[y] = index;
            index += step;
        }
        result = Integer.toString(progression[swap]);
        return result;

         */
    }

    public static void progression() {
        String[] question = new String[Engine.ROUNDS];
        String[] result = new String[Engine.ROUNDS];
        int index = 0;
        while(index < Engine.ROUNDS) {
            question[index] = question();
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
                System.out.println(answer + Engine.wrong + progression[swap]);
                System.out.println(Engine.wrong2 + userName);
                break;
            }
            Engine.raunds++;
        }
        if (Engine.raunds == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

         */
}

