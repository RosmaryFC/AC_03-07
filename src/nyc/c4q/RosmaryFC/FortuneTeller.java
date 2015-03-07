package nyc.c4q.RosmaryFC;
import java.util.Scanner;

/**
 * Created by c4q-rosmary on 3/7/15.
 * Rosmary and Hans
 * Write a command line fortune teller that responds to your questions
 */

public class FortuneTeller {
    public static void main(String[] args){

        String response1 = ("Yes");
        String response2 = ("No");
        String response3 = ("Maybe");
        String response4 = ("Fortune Not Clear");
        String question;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fortune Teller. What is your question?");
        question = input.nextLine();


        // || means "or"
        if (question.charAt(0) == 'a' || question.charAt(0) == 'A') {
            System.out.println( response1 );
        } else if (question.charAt(0) == 'w' || question.charAt(0) == 'W') {
            System.out.println ( response2 );
        } else if (question.charAt(0) == 'h' || question.charAt(0) == 'H') {
            System.out.println ( response3 );
        } else {
            System.out.println ( response4 );
        }

    }

}
