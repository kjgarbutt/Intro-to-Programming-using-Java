/**
* This program prints out a 3N+1 sequence starting from a positive
* integer specified by the user. It also counts the number of
* terms in the sequence, and prints out that number.
* Given a positive integer, N, define the ’3N+1’ sequence starting
* from N as follows: If N is an even number, then divide N by two;
* but if N is odd, then multiply N by 3 and add 1. Continue to generate
* numbers in this way until N becomes equal to 1. For example, starting
* from N = 3, which is odd, we multiply by 3 and add 1,
* giving N = 3*3+1 = 10. Then, since N is even, we divide by 2,
* giving N = 10/2 = 5. We continue in this way, stopping when we reach 1,
* giving the complete sequence: 3, 10, 5, 16, 8, 4,2, 1.
*/

public class ThreeN1 {
	public static void main(String[] args) {
		int N; // declare new variable, 'N', for computing terms in the sequence
		int counter; // declare new variable, 'counter', for counting the terms
		TextIO.put("Starting point for sequence: "); // prompts user
		N = TextIO.getlnInt(); // TextIO gets the integer entered and stores as 'N'
		while (N <= 0) { // start of While loop - While N is less than or equal to 0...
			TextIO.put("The starting point must be positive. Please try again: "); // prompt user to enter higher number
			N = TextIO.getlnInt(); // TextIO gets the integer entered and stores as 'N'
		}
		// At this point, we know that N > 0
		
		/*
		* replace 'counter = 0;' with:
		* TextIO.putln(N); // print out initial term
		* counter = 1; // and count it
		* To print out the value of N and make 'counter' equal to 1
		 */
		counter = 0; // makes the value of 'counter' 0
		while (N != 1) { // while N is NOT equal to 1...
			if (N % 2 == 0) //...and IF the remainder of N divided by 2 is equal to 0...
				N = N / 2; //...then N becomes N divided by 2
			else //...or ELSE...
				N = 3 * N + 1; //...N becomes 3 multiplied by N plus 1
			TextIO.putln(N); // TextIO prints out the current value of N
			counter = counter + 1; // 'counter' becomes 'counter' plus 1 (increments up)
		}
		
		// At this point, the while loop has ended because N has become 1 and we print out the results
		
		TextIO.putln(); // print blank line
		TextIO.put("There were "); // print out...
		TextIO.put(counter); //...plus the value of 'counter'...
		TextIO.putln(" terms in the sequence."); // print out...
	} // end of main()
	} // end of class ThreeN1