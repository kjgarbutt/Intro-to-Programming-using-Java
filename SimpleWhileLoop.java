public class SimpleWhileLoop	{
	public static void main (String[] args){
	int number; // The number to be printed.
		number = -10; // Start with 1.
		System.out.println("I can count to 10! Look:");
		while ( number < 11 ) { // Keep going as long as number is < 11.
			System.out.println(number);
			number = number + 1;	} // Go on to the next number.
		System.out.println("Done!");
	}
}