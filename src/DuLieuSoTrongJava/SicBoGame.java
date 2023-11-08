package DuLieuSoTrongJava;

import java.util.Random;
import java.util.Scanner;

public class SicBoGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Welcome to Sic Bo Game!");

		while (true) {
			int betAmount;
			int chosenNumber;

			// Get user's bet and chosen number
			System.out.print("Enter your bet amount: $");
			betAmount = scanner.nextInt();

			System.out.print("Choose a number between 1 and 6: ");
			chosenNumber = scanner.nextInt();

			if (chosenNumber < 1 || chosenNumber > 6) {
				System.out.println("Invalid input. Please choose a number between 1 and 6.");
				continue;
			}

			// Roll the dice
			int[] dice = new int[3];
			for (int i = 0; i < 3; i++) {
				dice[i] = random.nextInt(6) + 1;
			}

			// Display the result
			System.out.print("Dice result: ");
			for (int value : dice) {
				System.out.print(value + " ");
			}
			System.out.println();

			// Check if the player wins or loses
			boolean win = false;
			for (int value : dice) {
				if (value == chosenNumber) {
					win = true;
					break;
				}
			}

			if (win) {
				int winnings = betAmount * 2; // You win double the bet amount
				System.out.println("Congratulations! You win $" + winnings + ".");
			} else {
				System.out.println("Sorry, you lose.");
			}

			// Ask if the player wants to play again
			System.out.print("Do you want to play again? (y/n): ");
			String playAgain = scanner.next();
			if (!playAgain.equalsIgnoreCase("y")) {
				break;
			}
		}

		System.out.println("Thanks for playing Sic Bo Game!");
		scanner.close();
	}
}
