/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program reads a sequence of positive integers input
 * by the user, and it will print out the average of those
 * integers. The user is prompted to enter one integer at a
 * time. The user must enter a 0 to mark the end of the
 * data. (The zero is not counted as part of the data to
 * be averaged.) The program does not check whether the
 * user’s input is positive, so it will actually add up
 * both positive and negative input values.
 * CHAPTER 3. CONTROL 78
 */

public class ComputeAverage {
	public static void main(String[] args) {
		int inputNumber; // declare variable, 'inputNumber', as one of the integers input
		int sum; // declare variable, 'sum', to b the sum of the positive integers
		int count; // declare variable, 'count', to be the number of positive integers
		double average; // declare variable, 'average', to be the average of the positive integers input
		
		/* Initialize the summation and counting variables. */
		
		sum = 0; // assign 0 to sum
		count = 0; // assign 0 to count
		
		/* Read and process the user’s input. */
		
		TextIO.put("Enter your first positive integer: "); // print command
		inputNumber = TextIO.getlnInt(); // assign user input as variable 'inputNumber'
		while (inputNumber != 0) { // start While loop - while inputNumber is NOT EQUAL to 0...
			sum += inputNumber; //...add value of 'inputNumber' to running 'sum'...
			count++; //...add one to the value of 'count'
			TextIO.put("Enter your next positive integer, or 0 to end: "); // print command for next integer
			inputNumber = TextIO.getlnInt(); // re-use 'inputNumber' variable to store next inputed integer
		}
		
		/* Display the result. */
		
		if (count == 0) { // start of If Statement - If 'count' IS EQUAL TO 0...
			TextIO.putln("You didn’t enter any data!"); //...then print
		}
		else { //...ELSE, if count is NOT EQUAL to 0 because the above If Statement is False...
			average = ((double)sum) / count; // calculate 'average' by making 'sum' a double and the dividing it by 'count'
			TextIO.putln(); // print blank line
			TextIO.putln("You entered " + count + " positive integers."); // print 'count'
			TextIO.putf("Their average is %1.3f.\n", average); // print 'average'
		}
	} // end main()
} // end class ComputeAverage