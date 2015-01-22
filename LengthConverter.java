/**
* This program will convert measurements expressed in inches,
* feet, yards, or miles into each of the possible units of
* measure. The measurement is input by the user, followed by
* the unit of measure. For example: "17 feet", "1 inch", or
* "2.73 mi". Abbreviations in, ft, yd, and mi are accepted.
* The program will continue to read and convert measurements
* until the user enters an input of 0.
*/
public class LengthConverter {
	public static void main(String[] args) {
		double measurement; // Numerical measurement, input by user.
		String units;		// The unit of measure for the input, also
							// specified by the user.
		double inches, feet, yards, miles; // Measurement expressed in
										   // each possible unit of
										   // measure.
		TextIO.putln("Enter measurements in inches, feet, yards, or miles.");
		TextIO.putln("For example: 1 inch, 17 feet or 2.73 miles");
		TextIO.putln("You can use abbreviations: in, ft, yd or mi");
		TextIO.putln("I will convert your input into the other units");
		TextIO.putln("of measure.");
		TextIO.putln();
		
		while (true) {
			/* Get the user’s input, and convert units to lower case. */
			TextIO.put("Please enter your measurement, or press 0 to end: "); // print
			measurement = TextIO.getDouble(); // uses TextIO to get the double from the
										// user input and stores it as 'measurement' 
			if (measurement == 0)		// If user inputs 0...
				break; 					// ...then break the while loop and end the program
			units = TextIO.getlnWord();	// use TextIO to get whatever word (unit) input	
			units = units.toLowerCase(); // change whatever unit was input to LowerCase
			
			/* Convert the input measurement to inches. */
			
			if (units.equals("inch") || units.equals("inches")
									|| units.equals("in")) {
				inches = measurement;
			}
			// If the unit entered is either inch, inches or in, then store the 'measurement'
			// as 'inches' eg. if user entered "8 inches", store 8 as the variable 'inches'
			else if (units.equals("foot") || units.equals("feet")
									|| units.equals("ft")) {
				inches = measurement * 12;
			}
			// Else if the unit entered is either foot, feet or ft, then store the 'measurement'
			// as 'inches' eg. if user entered "8 inches", store 8 as the variable 'inches', and multiply
			// by 12 to get feet
			else if (units.equals("yard") || units.equals("yards")
									|| units.equals("yd")) {
				inches = measurement * 36;
			}
			// Else if the unit entered is either yard, yards or yd, then store the 'measurement'
			// as 'inches' eg. if user entered "8 yards", store 8 as the variable 'inches', and multiply
			// by 36 to get yards
			else if (units.equals("mile") || units.equals("miles")
									|| units.equals("mi")) {
				inches = measurement * 12 * 5280;
			// Else if the unit entered is either mile, miles or mi, then store the 'measurement'
			// as 'inches' eg. if user entered "8 miles", store 8 as the variable 'inches', and multiply
			// by 5280 to get miles
			}
			else {
				TextIO.putln("Sorry, but I don’t understand \""
									+ units + "\".");
				continue; // back to start of while loop
			}
			// Else, the user must have entered something that is not one of the supported units
			
			/* Convert measurement in inches to feet, yards, and miles. */
			
			feet = inches / 12;
			yards = inches / 36;
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
		TextIO.putln();
		TextIO.putln("OK! Bye for now.");
		
	} // end main()
} // end class LengthConverter