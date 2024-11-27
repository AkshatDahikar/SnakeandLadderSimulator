package SnakeandLadderSimulator;

import java.util.Random;
import java.util.Scanner;

public class Players {
	 private static final int WINNING_POSITION = 100;
	 private static final int[] SNAKES = {17, 54, 62, 64, 87, 93, 95, 99};
	 private static final int[] LADDERS = {3, 21, 38, 28, 50, 72, 80};
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int playerPosition = 0;
	        System.out.println("Welcome to Snake and Ladder Game!");
	        while (playerPosition < WINNING_POSITION) {
	            System.out.print("Press enter to roll the die...");
	            scanner.nextLine();
	            int dieRoll = random.nextInt(6) + 1;
	            System.out.println("You rolled a " + dieRoll);
	            playerPosition += dieRoll;
	            if (playerPosition > WINNING_POSITION) {
	            	 playerPosition -= dieRoll;
	            	 System.out.println("You cannot move beyond position  " + WINNING_POSITION);
	            }else {
	            	 System.out.println("git statPlayer is at position " + playerPosition);
	            	 playerPosition = checkSnakeAndLadder(playerPosition);

	            }
	            if (playerPosition == WINNING_POSITION) {
	                System.out.println("Congratulations! You've won the game!");
	            }
	            }
      scanner.close();
}
	private static int checkSnakeAndLadder(int position) {
		for(int ladder : LADDERS) {
			if(position == ladder) {
				position += 10;
				System.out.println("Yay! You found a ladder! Moving up to " + position);
                break;
			}
		}
		for(int snake: SNAKES) {
			if(position == snake) {
				position -=10;
				System.out.println("Oops ! You landed on a snake ! Moving down to"+position);
			}
		}
		return position;
	}}
