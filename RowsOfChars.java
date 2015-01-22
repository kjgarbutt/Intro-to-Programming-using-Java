/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 *
 * This program will get a line of input from the user.  It will
 * then output one line for each character in the user's input.  That
 * line will contain 25 copies of the character.
 *
 * This simple program is meant to demonstrate the use of subroutines,
 * and especially the case where one routine calls a subroutine
 * which then calls another subroutine.  It is not a useful program.
 * 
 * (Note:  It doesn't matter in what order the subroutines are
 * listed in the class.  A subroutine can always be used anywhere
 * in the class that defines it, even if the definition occurs
 * physically after the point where it is called.)
 */

public class RowsOfChars {

    public static void main(String[] args) {
        String inputLine;  // Line of text input by user.
        TextIO.put("Enter a line of text: ");
        inputLine = TextIO.getln(); // use TextIO to 'get' the line
        TextIO.putln();
        printRowsFromString( inputLine );
        	// use printRowsFromString to print 'inputLine' 
    }

    /**
     * For each character in str, write a line of output
     * containing 25 copies of that character.
     */
    private static void printRowsFromString( String str ) {
        int i;  // Loop-control variable for counting off the chars.
        for ( i = 0; i < str.length(); i++ ) {
        	// For i, which is 0, and where I is less than the string length, iterate i
            printRow( str.charAt(i), 25 );	// print the string char at i x25
        }
    }

    /**
     * Write one line of output containing N copies of the
     * character ch.  If N &lt;= 0, an empty line is output.
     */
    private static void printRow( char ch, int N ) {
        int i;  // Loop-control variable for counting off the copies.
        for ( i = 1; i <= N; i++ ) {
        	// for i, which is 1, and where i is LESS than or EQUAL to N, iterate i
            System.out.print( ch );	// print out the character, ch
        }
        System.out.println();
    }
} //end of class RowsOfChars