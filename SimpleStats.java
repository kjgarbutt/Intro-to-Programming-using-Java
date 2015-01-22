/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 *
 * Computes and display several statistics for a set of non-zero
 * numbers entered by the user.  (Input ends when user enters 0.)
 * This program uses StatCalc.java.
 */
   
	/*
    * A text scanner which can parse primitive types and strings using regular expressions. 
    * Breaks its input into tokens using a delimiter pattern, which by default matches
    * whitespace. Resulting tokens may then be converted into values of different types using
    * the various next methods. 
    * For example, this code allows a user to read a number from System.in: 
    */
    import java.util.Scanner;

    public class SimpleStats {
 
      public static void main(String[] args) {
 
          Scanner in = new Scanner(System.in);
 
          StatCalc calc; // Computes stats for numbers entered by user.
          calc = new StatCalc();
 
          double item; // One number entered by the user.
 
          System.out.println("Enter your numbers.  Enter 0 to end.");
          System.out.println();
 
          							// WHILE 'item' is NOT 0...
          do {						// DO the following...
            System.out.print("? ");		// ...print out "?"...
            item = in.nextDouble();		// ...take input and assign to 'item'...
            if (item != 0)				// ...IF 'item' is NOT 0...
                calc.enter(item);		// ...then add to 'calc'
          } while (item != 0);		
          
          // Print out stats using the methods in StatCalc.java eg. .getSum() or .getMean()
          System.out.println("\nStatistics about your calc:\n");
          System.out.println("  Count:              " + calc.getCount());
          System.out.println("  Sum:                " + calc.getSum());
          System.out.println("  Minimum:            " + calc.getMin());
          System.out.println("  Maximum:            " + calc.getMax());
          System.out.println("  Average:            " + calc.getMean());
          System.out.println("  Standard Deviation: "
                + calc.getStandardDeviation());
 
      } // end main()
 
    } // end SimpleStats