package hexlet.code.Games;

import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static int value1;
    public static int value2;
    public static int length;
    public static int swap;
    //public static int[] progression;
    public static String result;
    public static String[] term;
    public static String termClean;
    public static String greeting = "What number is missing in the progression?";
    public int getValue1() {
        return this.value1;
    }
    public int getValue2() {
        return this.value2;
    }
    public int getLength() {
        return this.length;
    }
    public int getSwap() {
        return this.swap;
    }
    //public int[] getProgression() {
    //    return this.progression;
    //}
    public String getResult() {
        return this.result;
    }
    public static String question() {
        Random rnd = new Random(System.currentTimeMillis());
        value1 = rnd.nextInt(200);
        value2 = rnd.nextInt(21);
        length = rnd.nextInt(5, 10);
        swap = rnd.nextInt(1, length);

        int[] progression = new int[length];
        int index = value1;
        for (var y = 0; y < length; y++) {
            progression[y] = index;
            index += value2;
        }
        term = Arrays.stream(progression).mapToObj(Integer::toString).toArray(String[]::new);
        term[swap] = "..";
        termClean = Arrays.toString(term).replace("[", "").replace("]", "").replace(",", "");
        //term[swap] = "..";

        return termClean;

    }
    public static String result() {
        int[] progression = new int[length];
        int index = value1;
        for (var y = 0; y < length; y++) {
            progression[y] = index;
            index += value2;
        }
        result = Integer.toString(progression[swap]);
        return result;
    }

    public static void progression() {

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

