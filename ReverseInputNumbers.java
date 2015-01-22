public class ReverseInputNumbers {

   public static void main(String[] args) {
   
     int[] numbers;  // An array for storing the input values.
     int count;      // The number of numbers saved in the array.
     int num;        // One of the numbers input by the user.
     
     numbers = new int[100];   // Space for 100 ints.
     count = 0;                // No numbers have been saved yet.
     
     System.out.println("Enter up to 100 positive integers; enter 0 to end.");
     
     // Get the numbers and put them in the array.
     
     while (true) {   // while (the following is) true...
        System.out.print("? ");
        num = TextIO.getlnInt();	// ...get all ints on the line and assign to 'num...
        if (num <= 0) {		// ...if 'num' (number input by user) is less or equal to 0...
              // Zero marks the end of input; we have all the numbers.
           break;	// ...then break out...
        }
        numbers[count] = num;  // ...Put 'num' in position count.
        count++;  // ...then increment up 'count'
     }
     
     System.out.println("\nYour numbers in reverse order are:\n");
     
     for (int i = count - 1; i >= 0; i--) {	// for (whilst) i, which is 'count', - 1, is greater than or equal to 0, increment
         System.out.println( numbers[i] ); //...then print
     }
     
   } // end main();
   
}  // end class ReverseInputNumbers
