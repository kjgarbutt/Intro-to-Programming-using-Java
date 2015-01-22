/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program will convert measurements expressed in inches,
 * feet, yards, or miles into each of the possible units of
 * measure. The measurement is input by the user, followed by
 * the unit of measure. For example: "17 feet", "1 inch", or
 * "2.73 mi". Abbreviations in, ft, yd, and mi are accepted.
 * The program will continue to read and convert measurements
 * until the user enters an input of 0.
 */

public class CopyOfLengthConverter {
	public static void main(String[] args) {
		int optionNumber;               // Option number from menu, selected by user.
		double measurement;         // A numerical measurement, input by the user.
		// The unit of measurement depends on which
		// option the user has selected.
		double inches; // The same measurement, converted into inches.
		double feet;
		double yards;
		double miles;
		/* Display menu and get user’s selected option number. */

		TextIO.putln("What unit of measurement does your input use?");
		TextIO.putln();
		TextIO.putln("      1. inches");
		TextIO.putln("      2. feet");
		TextIO.putln("      3. yards");
		TextIO.putln("      4. miles");
		TextIO.putln();
		TextIO.putln("Enter the number of your choice: ");
		optionNumber = TextIO.getlnInt();

		/* Read user’s measurement and convert to inches. */

		switch ( optionNumber ) {
			case 1:
				TextIO.putln("Enter the number of inches: ");
				measurement = TextIO.getlnDouble();
				inches = measurement;
				break;
			case 2:
				TextIO.putln("Enter the number of feet: ");
				measurement = TextIO.getlnDouble();
				feet = measurement * 12;
				break;
			case 3:
				TextIO.putln("Enter the number of yards: ");
				measurement = TextIO.getlnDouble();
				yards = measurement * 36;
				break;
			case 4:
				TextIO.putln("Enter the number of miles: ");
				measurement = TextIO.getlnDouble();
				miles = measurement * 12 * 5280;
				break;
			default:
				TextIO.putln("Error! Illegal option number! I quit!");
				System.exit(1);
		     } // end switch
		/* Now go on to convert inches to feet, yards, and miles... */

			
			/* Convert measurement in inches to feet, yards, and miles. */
			
			feet = feet / 12;
			yards = yards / 36;
			miles = inches / (12*5280);
			
			/* Output measurement in terms of each unit of measure. */
			
			TextIO.putln();
			TextIO.putln("That’s equivalent to:");
			TextIO.putf("%12.5g", inches);
			TextIO.putln(" inches");
			TextIO.putf("%12.5g", feet);
			TextIO.putln(" feet");
			TextIO.putf("%12.5g", yards);
			TextIO.putln(" yards");
			TextIO.putf("%12.5g", miles);
			TextIO.putln(" miles");
			TextIO.putln();
			
			/*
			 * The “g” format will print a real number in exponential form if it is very large or very small,
			 * and in the usual decimal form otherwise. Remember that in the format specification %12.5g, the
			 * 5 is the total number of significant digits that are to be printed, so we will always get the
			 * same number of significant digits in the output, no matter what the size of the number. If we
			 * had used an “f” format specifier such as %12.5f, the output would be in decimal form with 5
			 * digits after the decimal point. This would print the number 0.000000000745482 as 0.00000, with
			 * no significant digits at all! With the “g” format specifier, the output would be 7.4549e-10.)
			 */
			
		} // end while
		
		// Break jumps out to here
		
	} // end main()