/*
 * Name:       Ahmed Osman
 *
 * Course:     Summer 2021
 *
 * Date:       08/09/2021
 *
 * Filename:   EightBall.java
 *
 * Purpose:    Creating a program resembling a Magic Eight Ball with a mysterious feeling.
 */


import java.util.Scanner;           // Import Scanner Class to ask user's input
import java.util.Random;            // Import Random Class to generate response

public class EightBall {
    public static void main(String[] args){
        System.out.println("Please enter your name...");
        System.out.println("");
        Scanner input = new Scanner(System.in);         // Allow user to input their name

        String name = input.nextLine();         // Read the user's name
        System.out.println("");
        System.out.println("Well hello there " + name);

        System.out.println("Dare to ask on your fate?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        System.out.println("");
        int selection = input.nextInt();            // Read the user's response

        if (selection == 1) {
            System.out.println("");
            System.out.println("Very well then.");
            System.out.println("Ask away...");
            System.out.println("");
        } else if (selection == 2) {
            System.out.println("");
            System.out.println("Scared of the future are we?");
            System.out.println("Well then. Goodbye.");
            System.exit(1);         // End code since user is not interested
        }

        Scanner question = new Scanner(System.in);          // Read user's question
        String q = question.nextLine();
        System.out.println("");
        System.out.println("Interesting question " + name);
        System.out.println("");

        Random number = new Random();           // Generate Random number to provide a response
        int n = number.nextInt(9);

        // Switch cases provide responses by random number
        switch(n) {
            case 1:
                System.out.println("It is certain");
                break;
            case 2:
                System.out.println("It is decidedly so");
                break;
            case 3:
                System.out.println("Without a doubt");
                break;
            case 4:
                System.out.println("As I see it, Yes");
                break;
            case 5:
                System.out.println("Better not tell you now");
                break;
            case 6:
                System.out.println("Cannot predict now");
                break;
            case 7:
                System.out.println("Don't count on it");
                break;
            case 8:
                System.out.println("My sources say no");
                break;
            case 9:
                System.out.println("No");
                break;
            case 10:
                System.out.println("Outlook not so good");
                break;
            default:
                System.out.println("Concentrate. Is this really your wish! Ask me again later.");
        }


    }
}
