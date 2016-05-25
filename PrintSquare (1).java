/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * A program that reads an integer that is typed in by the
 * user and computes and prints the square of that integer.
 */

public class PrintSquare {
	public static void main(String[] args) {
		
		int userInput; // The number input by the user.
		int square; // The userInput, multiplied by itself.
		
		System.out.print("Please type a number: ");
		userInput = TextIO.getlnInt();
		square = userInput * userInput;
		System.out.print("The square of that number is ");
		System.out.println(square);
		
		/*
		Could replace System.out.print with:
		TextIO.put("The square of that number is ");
		TextIO.putln(square);
		*/
	} // end of main()
} //end of class PrintSquare