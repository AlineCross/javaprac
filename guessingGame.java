import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        int numberOfTries = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is out of bounds. Please try a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the absolute right number in " + numberOfTries + " tries!");
                break;
            }
        }
        scanner.close();
    }
}