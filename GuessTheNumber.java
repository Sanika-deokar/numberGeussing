import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int minRange = 1;
	        int maxRange = 100;
	        int attempts = 0;
	        int maxAttempts = 10; // Limiting the number of attempts
	        int score = 0;

	        boolean playAgain = true;

	        while (playAgain) {
	            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Guess what it is!");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == randomNumber) {
	                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
	                    score += (maxAttempts - attempts) * 10; // Giving points based on the number of attempts
	                    break;
	                } else if (userGuess < randomNumber) {
	                    System.out.println("Too low. Try again.");
	                } else {
	                    System.out.println("Too high. Try again.");
	                }
	            }

	            if (attempts >= maxAttempts) {
	                System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
	            }

	            System.out.println("Your score: " + score);
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainChoice = scanner.next().toLowerCase();
	            if (!playAgainChoice.equals("yes")) {
	                playAgain = false;
	            }

	            // Reset attempts for a new game
	            attempts = 0;
	        }

	        System.out.println("Thanks for playing!");
	        scanner.close();
	    }
	


	}


