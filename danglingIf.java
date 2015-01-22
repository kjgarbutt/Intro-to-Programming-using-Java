/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

public class danglingIf {
	public static void main(String [] args)	{
	
		// Both if statements must be true to get "First case"
		// Else return "Second case"		
		
		double x = -2;
		double y = 25;
		
		if ( x < 0 )
			System.out.println("First case");
		else
			System.out.println("Second case");
		
		// Result will be "First case"
		
	
		/*
		// Both if statements must be true to get "First case"
		// Else return "Second case"
		double x = 25;
		double y = 25;
		
		if ( x < 0 ) {
			if (y < 0)
			System.out.println("First case");
			}
			else
			System.out.println("Second case");
		
		// Result will be "Second case"
		
		
		double x = -1;
		double y = 5;
		
		if ( x > 0 ) {
		     if (y > 0)
		          System.out.println("First case");
		}
		else
		     System.out.println("Second case");
		
		// Result will be "Second case"
		*/

	}
}
