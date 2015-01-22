
public class danglingIf {
	public static void main(String [] args)	{
	
		// Both if statements must be true to get "First case"
		// Else return "Second case"		
		
		double x = -2;
		double y = 25;
		
		if ( x < 0 )
			System.out.println("First case");
		else
			System.out.println("Second case");
		
		// Result will be "First case"
		
	
		/*
		// Both if statements must be true to get "First case"
		// Else return "Second case"
		double x = 25;
		double y = 25;
		
		if ( x < 0 ) {
			if (y < 0)
			System.out.println("First case");
			}
			else
			System.out.println("Second case");
		
		// Result will be "Second case"
		
		
		double x = -1;
		double y = 5;
		
		if ( x > 0 ) {
		     if (y > 0)
		          System.out.println("First case");
		}
		else
		     System.out.println("Second case");
		
		// Result will be "Second case"
		*/

	}
}
