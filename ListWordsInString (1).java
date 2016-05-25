/**  
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program will read one line of input typed by the user.
 * It will print the words from the input, one word to a line.
 * A word is defined to be a sequence of letters.  All non-letters
 * in the input are discarded.
 */

public class ListWordsInString {

  public static void main(String[] args) {
  
      String line;    // A line of text, typed in by the user.
      int i;          // Position in line, from 0 to line.length() - 1.
      char ch;        // One of the characters in line.
      boolean didCR;  // Set to true if the previous output was a carriage return.
      
      /*
       * Uses a boolean variable named didCR.
       * The value of this variable will be true if the previous output was a
       * carriage return, allowing us to not print two in a row.
       * The program requires an initial value for didCR. In the program below,
       * I output a carriage return before the for loop and set didCR to true. You should be able to follow the rest of the program.
       */
      
      System.out.println("Enter a line of text.  ");
      line = TextIO.getln();	// gets the line input by user
      
      System.out.println();		// carriage return to set didCR to tru
      didCR = true;				// sets didCR to true
      
      /*
       * The for loop:
       * For i, which = 0, and where i is LESS than the total length of 'line', increment i
       * 	assign ch to the character at position i
       * 	if the character at ch IS a letter
       * 		then Print out that letter
       * 		And assign didCR to FALSE because no line was printed
       * 	Else
       * 		If a line was NOT printed
       * 			Then Print out a line
       * 			And set didCR to TRUE
       */	
      
      for ( i = 0;  i < line.length();  i++ ) {
          ch = line.charAt(i);
          if ( Character.isLetter(ch) ) {
            System.out.print(ch);
            didCR = false;
          }
          else {
            if ( didCR == false ) {
                System.out.println();
                didCR = true;
            }
          }
      }
      
      System.out.println();  // Make sure there's at least one carriage return at the end.
        
  }  // end main()

}  // end class ListWordsInString