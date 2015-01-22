/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

public class CountChange {
      
   /*  This program will add up the value of a number of quarters,
	   dimes, nickels, and pennies.  The number of each type of 
	   coin is input by the user.  The total value is reported
	   in dollars.  This program depends on the non-standard class,
	   TextIO.
	   
	   Steps:
	   Declare the variables.
       Ask the user for the number of each type of coin, and read the responses.
       Compute the total value of the coins, in dollars.
       Display the result to the user.
   */

	public static void main(String[] args) {
   
		int quarters;   // Number of quarters, to be input by the user.
		int dimes;      // Number of dimes, to be input by the user.
		int nickels;    // Number of nickels, to be input by the user.
		int pennies;    // Number of pennies, to be input by the user.

		double dollars; // Total value of all the coins, in dollars.

		/* Ask the user for the number of each type of coin. */

		TextIO.put("Enter the number of quarters:  ");
		//TextIO.put is like System.out.print 
		quarters = TextIO.getlnInt();
		//TextIO.getlnInt(); Reads a value of type int from the entire line

		TextIO.put("Enter the number of dimes:     ");
		//TextIO.put is like System.out.print 
		dimes = TextIO.getlnInt();

		TextIO.put("Enter the number of nickels:   ");
		//TextIO.put is like System.out.print 
		nickels = TextIO.getlnInt();

		TextIO.put("Enter the number of pennies:   ");
		//TextIO.put is like System.out.print 
		pennies = TextIO.getlnInt();

		/*  Add up the values of the coins, in dollars.
			Takes each coin and multiples it by its percentage of
			a dollar - so the number of quarters the user inputs
			is multiplied by 0.25.		
		*/

		dollars = (0.25 * quarters) + (0.10 * dimes) 
						  + (0.05 * nickels) + (0.01 * pennies); 
						  
		/* Alternatively, count up the total number of cents:
		
			int totalCents;  // Total number of cents in the coins.
            totalCents = 25*quarters + 10*dimes + 5*nickels + pennies;
            dollars = totalCents/100.0;
		*/	
		
		/* Report the result back to the user. */

		TextIO.putln();
		//TextIO.put is like System.out.println
		TextIO.putln("The total in dollars is $" + dollars);
		//TextIO.put is like System.out.println
   
	}  // end main()

}  // end class