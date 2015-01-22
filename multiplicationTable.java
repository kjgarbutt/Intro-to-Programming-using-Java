/**
 *  * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * Very basic program to print out a multiplication table
 * using a cheeky nested for loop
 */

public class multiplicationTable {
	public static void main(String[] args) {

	int rowNumber;  // declare a new integer variable, 'rowNumber', to cycle from row 1 to row 12
	int N;  		// declare a new integer variable, 'N', to cycle from 1 to 12
	for ( rowNumber = 1; rowNumber <= 12; rowNumber++ ) {
	     for ( N = 1; N <= 12; N++ ) {
	          System.out.printf( "%4d", N * rowNumber ); 
	          		// Print the first twelve multiples of 'rowNumber' on one line in 4-character columns
	          		// The format string "%4d" instructs the formatter to print ('.printf") the integer
	          		// in 4 character width padding with spaces as necessary
	          		// No carriage return !
	     }
	     System.out.println(); // Add a carriage return at end of the line.
		}
	}
}

/*
 * NOTE:
 * Carriage return is what it sounds like if you're familiar with old-fashioned manual
 * typewriters: It (println()) moves the "carriage" (the roll the paper is fed through) back to the
 * beginning of the line. On a terminal (or similar), it moves the output point back to
 * the beginning of the line, without moving down a line (usually).
 */