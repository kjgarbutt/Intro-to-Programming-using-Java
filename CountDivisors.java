/**
 * This program reads a positive integer from the user.
 * It counts how many divisors that number has, and
 * then it prints the result.
 * Pseudocode:
 * Get a positive integer, N, from the user
 * Let divisorCount = 0 // Number of divisors found.
 * Let numberTested = 0 // Number of possible divisors tested
 * 						// since the last period was output.
 * for each number, testDivisor, in the range from 1 to N:
 * 	if testDivisor is a divisor of N:
 * 		Count it by adding 1 to divisorCount
 * 	Add 1 to numberTested
 * 	if numberTested is 1000000:
 * 		print out a ’.’
 * 		Reset numberTested to 0
 * Output the count
 */
   
public class CountDivisors {
   
   public static void main(String[] args) {
      
      int N;  // declare a new integer variable, 'N', to be a positive integer entered by the user
              // the divisors of this number will be counted
              
      int testDivisor;  // declare a new integer variable, 'testDivisor', to be a number between
                        //  1 and 'N' that is a possible divisor of N.
      
      int divisorCount;	// declare a new integer variable, 'divisorCount' to be a number
      					//  of divisors of 'N' that have been found
      
      int numberTested;  // declare a new integer variable, 'numberTested'. to be used to count
                         // how many possible divisors of 'N' have been tested.  When the number
                         // reaches 1000000, a period is output and the value of 'numberTested'
      					 // is reset to zero
                         
      /* Get a positive integer from the user. */
   
      while (true) {	// While 'true'...
         System.out.print("Enter a positive integer: "); // ...print out...
         N = TextIO.getlnInt(); // assign user input as variable 'N' using TextIO's getlineinteger
         if (N > 0)	// ...if newly declared 'N' is GREATER-THAN 0...
            break;	// ...then terminate this loop...
         System.out.println("That number is not positive.  Please try again.");	// print out
      }
      
      /* Count the divisors, printing a "." after every 1000000 tests. */
    
      divisorCount = 0; // set 'divisorCount' to 0
      numberTested = 0;	// set 'numberTested' to 0
      
      for (testDivisor = 1; testDivisor <= N; testDivisor++) {	// for each newly declared 'testDivisor'
    	  														// between 1 and 'N'...
         if ( N % testDivisor == 0 )	// ...and IF 'N' modulus 'testDivisor' (remainders) EQUAL 0...
            divisorCount++;				// ...then count it by adding 1 to 'divisorCount'3
         numberTested++;				// ...then add 1 to the 'numberTested'...
         if (numberTested == 1000000) {	// ...IF the incremented 'numberTested' is EQUAL to 1million...
            System.out.print('.');		// ...then print a '.'...
            numberTested = 0;			// ...and reset the 'numberTested' back to 0
         }
      }
      
      /* Display the result. */
      
      System.out.println();				// print out a blank line for cleanliness
      System.out.println("The number of divisors of " + N	// ...then print out the number of divisors from the given number...
                          + " is " + divisorCount);			// ...and the count of the divisors.
      
   } // end main()
   
} // end class CountDivisors