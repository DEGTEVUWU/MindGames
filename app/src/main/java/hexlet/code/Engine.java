package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String userName;
    public static String wrongAnswer = " is wrong answer ;(. Correct answer was ";
    public static  String wrongAnswer2srting = "Let's try again, ";
    Engine (String userName) {
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
