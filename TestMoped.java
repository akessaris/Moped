package edu.nyu.cs.ank352;
/**
 * This program allows the user to drive a virtual moped
 * through Manhattan using a series of commands.
 * @author alexanderkessaris
 * @version 0.1
 */
import java.util.Scanner;

public class TestMoped {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/**
		 * Make a moped object using no-args constructor
		 */
		Moped moped = new Moped();
		System.out.println("Welcome to the Moped Simulator!\n"
				+ "Here is a list of the following commands:");
		moped.help();
		while (moped.isPark()==false) {
			/**
			 * Display location
			 */
			System.out.println("We're currently at " + moped.getStreet() 
			+ moped.street_ending(moped.getStreet()) + " St. and " + moped.getAvenue() 
			+ moped.avenue_ending(moped.getAvenue()) +" Ave heading " 
			+ moped.directionString(moped.getDirection()));
			
			/**
			 * Prompt user command and pass it to the Moped class
			 */
			System.out.println("What would you like to do?");
			String command = input.nextLine();
			switch (command) {
				case "go to Petite Abeille":
					moped.autoDrive();
					break;
				case "go left":
					moped.go_left();
					break;
				case "go right":
					moped.go_right();
					break;
				case "straight on":
					moped.straight_on();				
					break;
				case "back up":
					moped.back_up();
					break;
				case "help":
					moped.help();
					break;
				case "how we doin'":
					moped.getTank();
					break;
				case "fill 'er up":
					moped.setTank(1.0);
					break;
				case "park":
					moped.setPark(true);
					break;
				default:
					System.out.println("Congrats, we did nothing!");
			}
			
			/**
			 * Notify user if moped passes landmark
			 */
			if (!command.equals("go to Petite Abeille")) {
				moped.checkLandmarks(moped.getAvenue(), moped.getStreet());
			}

	}
		/**
		 * Close the scanner
		 */
		input.close();
	}
}
	

