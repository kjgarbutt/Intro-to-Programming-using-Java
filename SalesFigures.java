/**
* This program reads from a file named "sales.dat" (must be in same folder as program).
* Each line of the file contains the name of a city, followed by a colon, followed by
* either a number giving the amount of sales in that city or by a message saying why
* the sales figure is not available.  The program prints the total sales for all
* cities and the number of cites for which the figure was not available.
*/
 
public class SalesFigures {
 
  public static void main( String[] args ) {
     
      /* Open file for reading; if it can't be opened, end the program */
     
      try {
    	  // try to read the file...
        TextIO.readFile("sales.dat");
      }
      catch (IllegalArgumentException e) {
    	  // If the file doesn't exist, catch the Exception and print...
        System.out.println("Can't open file \"sales.dat\" for reading!");
        System.out.println("Please make sure the file is present before");
        System.out.println("running the program.");
        System.exit(1);
        	// Then terminate the program.
      }
     
      /* We get here ONLY if the file exists.
       * We read the file, keeping track of total sales and missing data
       * and print out the findings.
      */
     
      double salesTotal;  // Total of all sales figures seen so far.
      int missingCount;   // Number of cities for which data is missing.
     
      salesTotal = 0;
      missingCount = 0;
      	// Assign 0 to both salesTotal and missingCount to get started
     
      /* The while loop
       * While it is NOT the end of the file (eof)...
       		* Assign variables to the elements of the data...
       		* read the name of the city AND the colon that follows it
       		* read the rest of the line into a string - dataString
       		* try to convert the string into a number
       		* 	if the conversion succeeds, add the number to the total sales
       		* 	otherwise add 1 to the count of missing data
      */
      while ( ! TextIO.eof() ) {  
    	  	// while it is NOT the end of file (eof) process one line of data....
        char ch;  // Assign ch to the first character, to read past the name of the city
        String dataString;  // Assign dataString to the contents of line, after the city
        double sales;  // Assign sales to the double sales figure for the city
       
        do {  // ...do read past characters up to the ':'...
            ch = TextIO.getChar();
        } while (ch != ':'); // ...while ch is NOT EQUAL to ':'
       
        dataString = TextIO.getln();  // Get the rest of the line, after :
       
        try {	// try to convert the string to a double to get sales figures
            sales = Double.parseDouble(dataString);
            salesTotal += sales;  // Then add to salesTotal
            					  // This is skipped if the conversion fails.
        }
        catch (NumberFormatException e) {	// catch the exception if the conversion try fails
                // The dataString is not a number, so it counts as
                // missing data.  Add 1 to the missing data count.
            missingCount++;	// increment up the missingCount
        }
 
      } // end while
     
      /* Report the results. */
     
      System.out.printf("Total sales recorded from all cities: $%1.2f\n\n", salesTotal);
      if (missingCount == 0)
        System.out.println("Data was received from all cities.");
      else if (missingCount == 1)
        System.out.println("Data was missing from 1 city.");
      else
        System.out.printf("Data was missing from %d cities.\n", missingCount);
     
  } // end main()
 
} // end class SalesFigures
