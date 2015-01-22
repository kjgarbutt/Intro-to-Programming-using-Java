/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

public class emptyStatement {
	public static void main(String [] args)	{
	
	for (int i = 0; i < 10; i++)
		System.out.println("Hello");
		// prints "Hello" x10
	
	System.out.println();
	
	for (int i = 0; i < 10; i++);
		System.out.println("Hello");
		// prints "Hello" ONLY ONCE!
		/* Why?
		 * Because the “;” at the end of the first line is a statement,
		 * and it is this statement that is executed ten times.
		 * The System.out.println statement is not really inside the for
		 * statement at all, so it is executed just once, after the for
		 * loop has completed.
		 */
	}
}