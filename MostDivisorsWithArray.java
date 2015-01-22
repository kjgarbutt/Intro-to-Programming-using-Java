/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program counts the number of divisors for integers in the range
 * 1 to 10000.  It finds the maximum divisor count.  It outputs the
 * maximum divisor count and a list of all integers in the range that
 * have the maximum number of divisors.
 */

public class MostDivisorsWithArray {

  public static void main(String[] args) {
 
      int N;            // One of the integers whose divisors we have to count.
      int maxDivisors;  // Maximum number of divisors seen so far.
     
      int[] saveCount;  // Store the number of divisors for each number
     
      saveCount = new int[10001];
     
      maxDivisors = 1;  // Start with the fact that 1 has 1 divisor.
      saveCount[1] = 1;

      /* Process all the remaining values of N from 2 to 10000, and store
          all the divisor counts in the array.  Update the value of maxDivisor
          whenever we find a value of N that has more divisors than the current
          value.
      */
      /*
       * The for loop:
       * For N, which = 2, and where N is LESS than or EQUAL to 10000, increment N
       *      for D, which = 1, and where D is LESS than or EQUAL to N, increment D
       *      		if N modulus D (the remainder of N / D) is NOT 0
       *      			increment divisorCount
       *      assign saveCount[N] to divisorCount
       *      if divisorCount is GREATER than maxDivisors
       *      		maxDivisors = divisorCount
       */
      
      for ( N = 2;  N <= 10000;  N++ ) {
     
          int D;  // A number to be tested to see if it's a divisor of N.
          int divisorCount;  // Number of divisors of N.
         
          divisorCount = 0;
         
          for ( D = 1;  D <= N;  D++ ) {  // Count the divisors of N.
              if ( N % D == 0 )
                divisorCount++;
          }
         
          saveCount[N] = divisorCount;  // Record the count for N in the array
         
          if (divisorCount > maxDivisors) {
              maxDivisors = divisorCount;
          }
     
      }
     
      System.out.println("Among integers between 1 and 10000,");
      System.out.println("The maximum number of divisors was " + maxDivisors);
      System.out.println("Numbers with that many divisors include:");
      /*
       * for N, which = 1, and where N is LESS than or EQUAL to 10000, increment N
       * 	if saveCount[N] is NOT EQUAL to maxDivisors
       * 		print
       */
      for ( N = 1; N <= 10000; N++ ) {
          if ( saveCount[N] == maxDivisors ) {
              System.out.println( "  " + N );
          }
      }
 
  } // end main()

}
