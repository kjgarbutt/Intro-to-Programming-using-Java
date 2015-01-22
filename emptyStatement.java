
public class emptyStatement {
	public static void main(String [] args)	{
	
	for (int i = 0; i < 10; i++)
		System.out.println("Hello");
		// prints "Hello" x10
	
	System.out.println();
	
	for (int i = 0; i < 10; i++);
		System.out.println("Hello");
		// prints "Hello" ONLY ONCE!
		/* Why?
		 * Because the “;” at the end of the first line is a statement,
		 * and it is this statement that is executed ten times.
		 * The System.out.println statement is not really inside the for
		 * statement at all, so it is executed just once, after the for
		 * loop has completed.
		 */
	}
}