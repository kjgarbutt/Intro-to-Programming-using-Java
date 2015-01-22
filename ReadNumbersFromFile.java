/**
 * This program reads numbers from a file.  It computes the sum and 
 * the average of the numbers that it reads.  The file should contain 
 * nothing but numbers of type double; if this is not the case, the 
 * output will be the sum and average of however many numbers were 
 * successfully read from the file.  The name of the file will be
 * input by the user.
 */

public class ReadNumbersFromFile {
   
   public static void main(String[] args) {
            
      while (true) {
         String fileName;
         	// Creates a string variable, "fileName", that will store the name
         	// of the file to be input by the user
         TextIO.putln("Enter the name of the file + its extension. ");
         TextIO.putln("(e.g. NumbersFromFile.txt):");
         fileName = TextIO.getln();
         	// Uses TextIO.getln to 'get' the entire line of the user's input
         try {
            TextIO.readFile( fileName );
            	// Try to open the file for input
            break;
            	// If readFile succeeds, "break" out of the loop
         }
         catch ( IllegalArgumentException e ) {
        	 // If Try fails to readFile, "catch" the "IllegalArgumentException"
            TextIO.putln("Can't read from the file \"" + fileName + "\".");
            TextIO.putln("Please try again.\n");
         }
      }
      
      // At this point, TextIO is reading from the file.
      
      // Create variables for calculation of numbers in file
      double number;  // A number read from the data file.
      double sum;     // The sum of all the numbers read so far.
      int count;      // The number of numbers that were read.
      
      sum = 0;	// Assign sum and count as 0
      count = 0;
      
      try {
    	  // Start a try loop that ends when an exception occurs
         while (true) { 
        	 // while true...
             number = TextIO.getDouble();
             	//assign double to variable 'number'
             count++;  // This is skipped when the exception occurs
             	// iterate up 'count'
             sum += number;
             // the value of "number" is added to the value of "sum" and then "sum" is re-assigned the total value
             // The plus-equals operator (+=) adds the value on the right,
             // to the variable on the left, and then assigns that value back
             // into the variable on the left. For example: 
             // int a = 6; 		// assigns the value 6 to variable a
             // a += 5; 		// adds 5 to a, and assigns that value back into a, now a is 11
             	
         }
      }
      catch ( IllegalArgumentException e ) {
         // We expect this to occur when the end-of-file is encountered.
         // We don't consider this to be an error, so there is nothing to do
         // in this catch clause.  Just proceed with the rest of the program.
      }
      
      // At this point, we've read the entire file.
      
      TextIO.putln();
      TextIO.putln("Number of data values read: " + count);
      TextIO.putln("The sum of the data values: " + sum);
      if ( count == 0 )
         TextIO.putln("Can't compute an average of 0 values.");
      else
         TextIO.putln("The average of the values:  " + (sum/count));
      
   }

}
