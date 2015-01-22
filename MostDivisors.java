/**
* This program finds an integer between 1 and 10000 that has
* the largest number of divisors.  It prints out the maximum
* number of divisors and an integer that has that many divisors.
*/

public class MostDivisors {

  public static void main(String[] args) {
 
      int N;            // One of the integers whose divisors we have to count.
      int maxDivisors;  // Maximum number of divisors seen so far.
      int numWithMax;   // A value of N that had the given number of divisors.
     
      maxDivisors = 1;  // assign 1 to maxDivisors to avoid an error because 
      					// maxDivisors isn't assigned a value until the for loop
      numWithMax = 1;	// assign 1 to numWithMax to avoid an error because
      					// the computer does NOT know if the if statement will ever
      					// be executed and so would assume we never initialise it

      /* Process all the remaining values of N from 2 to 10000, and
          update the values of maxDivisors and numWithMax whenever we
          find a value of N that has more divisors than the current value
          of maxDivisors.
      */
     
      for ( N = 2;  N <= 10000;  N++ ) {
    	  // for N (the integer to be tested), which is now assigned the value of 2, 
    	  // and where N is LESS than or EQUAL to 10,000, execute the following,
    	  // then iterate up N
    	  
          int D;  			// A number to be tested to see if it's a divisor of N.
          int divisorCount;	// Number of divisors of N.
         
          divisorCount = 0;	// Assign 0 to divisorCount
         
          for ( D = 1;  D <= N;  D++ ) {  // Count the divisors of N.
        	  // for D (divisor of N), which is now assigned the value of 1,
        	  // and where D is LESS than or Equal to N (integer being tested),
        	  // execute the following, then iterate up D
              if ( N % D == 0 )	// if N modulus D (the remainder after N / D) is EQUAL to 0
                divisorCount++;	// iterate up divisorCount
          }
         
          if (divisorCount > maxDivisors) { // if divisorCount is GREATER than maxDivisor
              maxDivisors = divisorCount;	// then assign maxDivisors to EQUAL divisorCount
              numWithMax = N;				// and assign numWithMax to N 
          }
     
      }
     
      // Print the findings:
      
      System.out.println("Among integers between 1 and 10000,");
      System.out.println("The maximum number of divisors is " + maxDivisors);
      System.out.println("A number with " + maxDivisors + " divisors is " + numWithMax);
 
  } // end main()

}

