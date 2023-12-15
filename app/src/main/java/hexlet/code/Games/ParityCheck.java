package hexlet.code.Games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class ParityCheck {
    public static boolean result;
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static int question() {
        int value = Utils.generateNumber(1, 200);
        result = isEven(value);
        return value;
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
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



