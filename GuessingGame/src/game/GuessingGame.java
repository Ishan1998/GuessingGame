package game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void Game() {
		int random;
		Random num = new Random();
		int upperbound = 100;
		for (int i = 1; i <= 5; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number: ");
			random = input.nextInt();
			if(random<=100) {
			int newno = num.nextInt(upperbound);
			System.out.println("Random number generated is: " + newno);
			if (random == newno) {
				System.out.println("Number matched");
			} else if (random > newno) {
				System.out.println("Guessed number " + random + " is greater than Random number " + newno);
			} else {
				System.out.println("Guessed number " + random + " is smaller than Random number " + newno);
			}			
		}}
		System.out.println("You lost the game. Better luck next time!");
	}

	public static void main(String[] args) {
		Game();
	}
}
