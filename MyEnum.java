public class MyEnum {
	
	enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
	enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }
	enum Food {PEANUT, JAM, CHICKEN, CURRY, CHOCOLATE, PORRIDGE, COFFEE, ICECREAM }
	// the enums must be OUTSIDE of main()
		// by convention they're all capitals
	
	public static void main(String [] args) {
		Day day;	// declare a variable of type Day
		Month month;
		Food food;
		for ( Day d : Day.values() ) {	// For each Day (d) in Day.values()...
										// (that is to say each value within the enum list, 'Day')
			System.out.print( d );		// print out each Day (d)...
		    System.out.print(" is day number ");	//...then print out...
		    System.out.println( d.ordinal()+1 );		// ...then print out the ordinal (order number)
		     										// of each Day (d)
		}
		
		System.out.println();
		
		for ( Month m : Month.values())	{
			System.out.print( m );		// print out each Day (d)...
	     	System.out.print(" is month number ");	//...then print out...
	     	System.out.println( m.ordinal()+1 );		// ...then print out the ordinal (order number)
		}
		
		System.out.println();
		
		for ( Food f : Food.values())	{
			System.out.print( f );		// print out each Day (d)...
	     	System.out.print(" is number ");	//...then print out...
	     	System.out.print( f.ordinal()+1 );		// ...then print out the ordinal (order number)
	     	System.out.println(" on my list of fave foods ");	//...then print out...
		}
	}	
}