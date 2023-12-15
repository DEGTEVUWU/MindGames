package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class GCD {
    public static int result;
    public static final String DESCRIPTION  = "Find the greatest common divisor of given numbers.";

    public static String question() {
        int value1 = Utils.generateNumber(1, 200);
        int value2 = Utils.generateNumber(1, 200);
        String term = value1 + " " + value2;
        result = gsd(value1, value2);
        return term;
    }

    public static int gsd(int value1, int value2) {
        return value2 == 0 ? value1 : gsd(value2, value1 % value2);
    }

    public static void dataEntry() {

        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i][Engine.INDEX_QUESTION] = question();
            roundsData[i][Engine.INDEX_RESULT] = String.valueOf(result);
        }

        Engine.communication(DESCRIPTION, roundsData);
    }
}

