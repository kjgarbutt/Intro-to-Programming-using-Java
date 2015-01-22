/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 *
 */

public class SimpleWhileLoop	{
	public static void main (String[] args){
	int number; // The number to be printed.
		number = -10; // Start with 1.
		System.out.println("I can count to 10! Look:");
		while ( number < 11 ) { // Keep going as long as number is < 11.
			System.out.println(number);
			number = number + 1;	} // Go on to the next number.
		System.out.println("Done!");
	}
}