package ProblemSolvingTask;

import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int date = 16;
        int guessCount = 0;
        while (true) {
            System.out.print("Kindly Guess the date please: ");
            int guessedNumber = input.nextInt();
            guessCount++;
            if (guessedNumber < date) {
                System.out.println("Incorrect");
            } else if (guessedNumber > date) {
                System.out.println("Incorrect");
            } else {
                System.out.println("Correct");
                break;
            }
//            if (guessCount >= 3) {
//                System.out.println("You have exceeded the maximum number of guesses.");
//                break;
//            }
        }
        }


    }






















