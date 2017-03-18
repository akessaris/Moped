package edu.nyu.cs.ank352;

/**
 * This class provides the class attributes, data fields,
 * getters and setters, and any other necessary thing necessary
 * to drive the moped in TestMoped.
 * @author alexanderkessaris
 * @version 0.1
 */
public class Moped {
	
	/**
	 * no-args constructor
	 */
	public Moped() {	
}
		
/**
 * Methods
 */
	/**
	 * This method is called when user enters go right
	 */
	public void go_left() {
		switch (direction) {
		case NORTH:
			this.setAvenue(avenue+1);
			this.setDirection(Moped.WEST);
			this.setTank(tank-0.05);
			break;
		case SOUTH:
			this.setAvenue(avenue-1);
			this.setDirection(Moped.EAST);
			this.setTank(tank-0.05);
			break;
		case EAST:
			this.setStreet(street+1);
			this.setDirection(Moped.NORTH);
			this.setTank(tank-0.05);
			break;
		case WEST:
			this.setStreet(street-1);
			this.setDirection(Moped.SOUTH);
			this.setTank(tank-0.05);
			break;
		}
	}
	/**
	 * This method is called when user enters "go right"
	 */
	public void go_right() {
		switch (direction) {
		case NORTH:
			this.setAvenue(avenue-1);
			this.setDirection(Moped.EAST);
			this.setTank(tank-0.05);
			break;
		case SOUTH:
			this.setAvenue(avenue+1);
			this.setDirection(Moped.WEST);
			this.setTank(tank-0.05);
			break;
		case EAST:
			this.setStreet(street-1);
			this.setDirection(Moped.SOUTH);
			this.setTank(tank-0.05);
			break;
		case WEST:
			this.setStreet(street+1);
			this.setDirection(Moped.NORTH);
			this.setTank(tank-0.05);
			break;
		}
	}
	/**
	 * This method is called when user enters "straight on"
	 */
	public void straight_on() {
		switch (direction) {
		case NORTH:
			this.setStreet(street+1);
			this.setTank(tank-0.05);
			break;
		case SOUTH:
			this.setStreet(street-1);
			this.setTank(tank-0.05);
			break;
		case EAST:
			this.setAvenue(avenue-1);
			this.setTank(tank-0.05);
			break;
		case WEST:
			this.setAvenue(avenue+1);
			this.setTank(tank-0.05);
			break;
		}
	}
	/**
	 * This method is called when user enters "back up"
	 */
	public void back_up() {
		switch (direction) {
		case NORTH:
			this.setStreet(street-1);
			this.setDirection(Moped.SOUTH);
			this.setTank(tank-0.05);
			break;
		case SOUTH:
			this.setStreet(street+1);
			this.setDirection(Moped.NORTH);
			this.setTank(tank-0.05);
			break;
		case EAST:
			this.setAvenue(avenue+1);
			this.setDirection(Moped.WEST);
			this.setTank(tank-0.05);
			break;
		case WEST:
			this.setAvenue(avenue-1);
			this.setDirection(Moped.EAST);
			this.setTank(tank-0.05);
			break;
		}
	}
	/**
	 * This method is called when user enters "go to Petite Abeille"
	 */
	public void autoDrive() {	
		while ((this.getStreet()!=17 || this.getAvenue()!=6)&& tank>0) {
				if (this.getStreet()>17) {
					this.setStreet(street-1);
					this.setDirection(SOUTH);
					this.setTank(tank-0.05);
				}
				else if (this.getStreet()<17) {
					this.setStreet(street+1);
					this.setDirection(NORTH);
					this.setTank(tank-0.05);
				}
				else if (this.getAvenue()>6) {
					this.setAvenue(avenue-1);
					this.setDirection(EAST);
					this.setTank(tank-0.05);

				}
				else if (this.getAvenue()<6) {
					this.setAvenue(avenue+1);
					this.setDirection(WEST);
					this.setTank(tank-0.05);
				}
				System.out.println("We're currently at " + this.getStreet() 
				+ street_ending(street) + " St. and " + this.getAvenue() + avenue_ending(avenue) 
				+" Ave heading " + this.directionString(this.getDirection()));
				this.checkLandmarks(getAvenue(), getStreet());
			}
		}
	/**
	 * This method is called when user enters "help"
	 */
	public void help() {
		System.out.println("go left = makes moped go left\n"
				+ "go right = make moped go right\n"
				+ "straight on = go forward\n"
				+ "back up = go opposite direction\n"
				+ "how we doin'? = check gas tank\n"
				+ "fill 'er up = fill gas tank\n"
				+ "park = park the car and end program\n"
				+ "go to Petite Abeille = auto-drive to Petite Abeille\n"
				+ "help = display commands\n");
	}
	/**
	 * Allows user to keep track of direction
	 */
	public String directionString(int direction) {
		switch (direction) {
		case 0:
			return "North";
		case 1:
			return "South";
		case 2:
			return "East";
		case 3:
			return "West";
		default:
			return "South";
		}
	}
	/**
	 * Used to find correct ending for streets
	 * @param avenue
	 * @return String
	 */
	public String street_ending(int street) {
		switch (street) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";
		default:
			return "th";	
		}
		
	}
	/**
	 * Used to find correct ending for avenues
	 * @param avenue
	 * @return String
	 */
	public String avenue_ending(int avenue) {
		switch (avenue) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";
		default:
			return "th";	
		}
	}
	
/**
 * Getters and Setters
 * @return park,avenue,street,tank
 */
	public boolean isPark() {
		return park;
	}

	public int getAvenue() {
		return avenue;
	}

	/**
	 * This setter sets avenue and checks to make sure moped doesn't go off grid
	 */
	public void setAvenue(int avenue) {
		if (avenue<=10 && avenue>=1) {
			this.avenue = avenue;
		}
		else {
			System.out.println("Sorry, you can't go outside the 200 St x 10 Ave grid.");
		}
	}

	public int getStreet() {
		return street;
	}
	/**
	 * This setter sets street and checks to make sure moped doesn't go off grid
	 */
	public void setStreet(int street) {
		if (street<=200 && street>=1) {
			this.street = street;
		}
		else {
			System.out.println("Sorry, you can't go outside the 200 St x 10 Ave grid.");
		}	
	}

	/**
	 * If user enters park, park becomes true and program ends
	 * @param park
	 */
	public void setPark(boolean park) {
			this.park = park;
			if (park==true) {
				System.out.println("You have parked your moped. Thank you for using the Moped Simulator!");
			}
	}
	/**
	 * Getter that displays amount of gas remaining as a percentage
	 */
	public double getTank() {
		System.out.printf("Our gas tank is currently %%%2.0f full.\n",tank*100);
		return tank;
	}
	/**
	 * This setter is used to fill the tank of gas and to inform user when
	 * moped is out of gas and ends the program
	 */
	public void setTank(double tank) {
		this.tank = tank;
		if (tank==1.0) {
			System.out.println("Ok, we now have a full tank of gas!");
		}
		else if (tank<=0) {
			System.out.println("We've run out of gas! We have to pull over...");
			this.park = true;
		}
		
	}
	
	public void setDirection(int direction) {
		this.direction = direction;
		}

	public int getDirection() {
		return this.direction;
}
	public void checkLandmarks(int avenue, int street) {
		if (this.getStreet()==79 && this.getAvenue()==8) {
			System.out.println("Welcome to the American Museum of Natural History!");
		}
		else if (this.getStreet()==74 && this.getAvenue()==1) {
			System.out.println("Welcome to the Memorial Sloan Kettering!");
		}
		else if (this.getStreet()==12 && this.getAvenue()==4) {
			System.out.println("Welcome to The Strand!");
		}
		else if(this.getStreet()==3 && this.getAvenue()==6) {
			System.out.println("Welcome to the Fayda Coffee Tea Cookies Cake shop!");
		}
		else if(this.getStreet()==17 && this.getAvenue()==6) {
			System.out.println("Welcome to Petite Abeille!");
		}
	}
	
/**
* Class attributes
*/
	/**
	 * Directions
	 */
	public final static int NORTH = 0;
	public final static int SOUTH = 1;
	public final static int EAST = 2;
	public final static int WEST = 3;

	/**
	 * Data fields
	 */
	private boolean park = false;
	private int direction = SOUTH;
	private double tank = 1.0;
	private int avenue = 5;
	private int street = 10;
	

}


