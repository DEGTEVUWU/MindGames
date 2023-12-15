package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;


public class Progression {
    public static String result;
    static final String DESCRIPTION  = "What number is missing in the progression?";

    public static String[] makeProgression(int first, int step, int length) {
        int[] progression = new int[length];
        int index = first;
        for (var y = 0; y < length; y++) {
            progression[y] = index;
            index += step;
        }
        String[] term = Arrays.stream(progression).mapToObj(Integer::toString).toArray(String[]::new);
        return term;
    }
    public static String question() {
        int first = Utils.generateNumber(1, 200);
        int step = Utils.generateNumber(1, 21);
        int length = Utils.generateNumber(5, 10);
        int swap = Utils.generateNumber(1, length - 1);

        String[] progression = makeProgression(first, step, length);
        result = progression[swap];
        progression[swap] = "..";
        String question = String.join(" ", progression);

        return question;

    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i][Engine.INDEX_QUESTION] = question();
            roundsData[i][Engine.INDEX_RESULT] = result;
        }
        Engine.communication(DESCRIPTION, roundsData);
    }
}

