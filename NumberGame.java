import java.util.Scanner;
import java.util.Random;

public class NumberGame {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Random random = new Random();
 int numberToGuess = random.nextInt(100) + 1;
 int numberOfTries = 0;
 boolean hasGuessedCorrectly = false;

 System.out.println("Welcome to the Number Guessing Game! You have 3 chances to guess the number between 1 and 100.");

 while (numberOfTries < 3) {
     System.out.print("Enter your guess: ");
         int userGuess = sc.nextInt();
         numberOfTries++;

 if (userGuess == numberToGuess) {
     hasGuessedCorrectly = true;
     break;
     } else {
     System.out.println("Wrong guess! Try again.");
     }
     }

 if (hasGuessedCorrectly) {
 System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
 } else {
     System.out.println("Sorry, you have used all your chances. The number to guess was: " + numberToGuess);
 }

 sc.close();
 }
}