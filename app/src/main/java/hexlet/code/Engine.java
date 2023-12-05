package hexlet.code;

public class Engine {

    public static String userName;
    public static final String wrongAnswer = " is wrong answer ;(. Correct answer was ";
    public static  final String wrongAnswer2srting = "Let's try again, ";
    public static int raunds = 0;
    Engine(String userName) {
        this.userName = userName;
    }
    public static String getUserName() {
        return userName;
    }
    public static void   comunication() {
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        //System.out.println("Hello, " + userName + "!");
    }
}
