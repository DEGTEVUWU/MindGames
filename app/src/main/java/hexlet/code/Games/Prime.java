package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static boolean result;
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static int question() {
        int value1 = Utils.generateNumber(1, 600);
        result = isEven(value1);
        return value1;
    }

    public static boolean isEven(int value1) {
        int index = 0;
        for (var y = 1; y <= value1; y++) {
            if (value1 % y == 0) {
                index += 1;
            }
        }
        return (index <= 2);
    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i][Engine.INDEX_QUESTION] = String.valueOf(question());
            roundsData[i][Engine.INDEX_RESULT] = result ? "yes" : "no";
        }
        Engine.communication(DESCRIPTION, roundsData);
    }
}
