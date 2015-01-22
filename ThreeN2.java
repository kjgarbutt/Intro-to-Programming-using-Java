/**
* A program that computes and displays several 3N+1 sequences.  Starting
* values for the sequences are input by the user.  Terms in the sequence
* are printed in columns, with five terms on each line of output.
* After a sequence has been displayed, the number of terms in that
* sequence is reported to the user.
*/
public class ThreeN2 {
	
  /**
    * print3NSequence prints a 3N+1 sequence to standard output, using
    * startingValue as the initial value of N.  It also prints the number
    * of terms in the sequence. The value of the parameter, startingValue,
    * must be a positive integer.
    */       
	
  public static void main(String[] args) {

      System.out.println("This program will print out 3N+1 sequences");
      System.out.println("for starting values that you specify.");
      System.out.println();
     
      int K;  // Create new variable, K, to be user specified starting point for sequence
      do {
        System.out.println("Enter a starting value;");
        System.out.print("To end the program, enter 0: ");
        K = TextIO.getlnInt();  // get starting value from user
        if (K > 0)              // print sequence, but only if K is > 0
            print3NSequence(K);
      } while (K > 0);          // continue only if K > 0

      /*
       * Do...
       * 	...print out...
       * 	...and use TextIO to 'get' user input and store as 'K'
       * 	...and IF K is GREATER than 0...
       * 		...print out the 3N+1 sequence...
       * 	...DO all this WHILE K is GREATER than 0...
       */
      
  } // end main


  /**
    * print3NSequence prints a 3N+1 sequence to standard output, using
    * startingValue as the initial value of N.  It also prints the number
    * of terms in the sequence. The value of the parameter, startingValue,
    * must be a positive integer.
    */
  static void print3NSequence(int startingValue) {
 
      int N;      // One of the terms in the sequence.
      int count;  // The number of terms found.
      int onLine;  // The number of terms that have been output
                  //    so far on the current line.
     
      N = startingValue;  // Start the sequence with startingValue;
      count = 1;          // We have one term so far.
 
      System.out.println();
      System.out.println("The 3N+1 sequence starting from " + N);
      System.out.println();
      System.out.printf("%8d", N);  // Print initial term, using 8 characters.
      onLine = 1;        // There's now 1 term on current output line.
 
      while (N > 1) {
          N = nextN(N);  // compute next term
          count++;  // count this term
          if (onLine == 5) {  // If current output line is full
            System.out.println();  // ...then output a carriage return
            onLine = 0;      // ...and note that there are no terms
                              //              on the new line.
          }
          System.out.printf("%8d", N);  // Print this term in an 8-char column.
          onLine++;  // Add 1 to the number of terms on this line.
          
      /*
       * WHILE...N is GREATER than 1...
       * 	...compute the next term (nextN) AND assign to 'N'...
       * 	...iterate 'count'...
       * 	...and IF the current output line (onLine) has 5 line...
       * 		...then Print a new line...
       * 		...and assign 0 to onLine to start again...
       * 	...and print out the term in columns...
       * 	...and add 1 to the line 
       */
      }
 
      System.out.println();  // end current line of output
      System.out.println();  // and then add a blank line
      System.out.println("There were " + count + " terms in the sequence.");
      System.out.println();
 
  }  // end of print3NSequence
 
 
  /**
    * nextN computes and returns the next term in a 3N+1 sequence,
    * given that the current term is currentN.
    */
  static int nextN(int currentN) {
      if (currentN % 2 == 1) // test if current N is odd
          return 3 * currentN + 1;	// if so, return the next term in the 3N+1 sequence
      else		// else it must be even...
          return currentN / 2;	// so return the current term
      /*
       * IF the current term can be divided by 2 and has a remainder of 1 (then it's odd...
       * 	...then RETURN the value of 3*currentN+1, the next term in the sequence... 
       * ELSE...
       * 	...RETURN currentN/2, which will be EVEN
       */
  }  // end of nextN()
 
 
} // end of class ThreeN2
