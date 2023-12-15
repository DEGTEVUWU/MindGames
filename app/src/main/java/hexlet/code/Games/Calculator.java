package hexlet.code.Games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static int result;
    public static final String DESCRIPTION  = "What is the result of the expression?";

    public static String question() {

        int value1 = Utils.generateNumber(1, 200);
        int value2 = Utils.generateNumber(1, 200);
        int indexOperators = Utils.generateNumber(0, 2);
        char[] operators = {'+', '-', '*'};
        char operator = operators[indexOperators];
        result = result(operator, value1, value2);
        return value1 + " " + operator + " " + value2;
    }

    private static int result(char operator, int value1, int value2) {
        switch (operator) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
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
