/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * Simulate choosing people at random and checking the day
 * of the year they were born on.  If the birthday is the
 * same as one that was seen previously, stop, and output
 * the number of people who were checked.
 */
public class BirthdayProblem {

   public static void main(String[] args) {

       boolean[] used;  // For recording the possible birthdays
                        //   that have been seen so far.  A value
                        //   of true in used[i] means that a person
                        //   whose birthday is the i-th day of the
                        //   year has been found.

       int count;       // The number of people who have been checked.

       used = new boolean[365];  // Initially, all entries are false.
   
       count = 0;

       while (true) {
             // Select a birthday at random, from 0 to 364.
             // If the birthday has already been used, quit.
             // Otherwise, record the birthday as used.

          int birthday;  // The selected birthday.
          birthday = (int)(Math.random()*365); // assign 'birthday' a random date between 0-365
          count++;	// iterate the 'count'

          System.out.printf("Person %d has birthday number %d", count, birthday);
          System.out.println();

          if ( used[birthday] ) {  
                // This day was found before; it's a duplicate.  We are done.
             break;
          }

          used[birthday] = true;

       } // end while

       System.out.println();
       System.out.println("A duplicate birthday was found after " 
                                             + count + " tries.");
   }

} // end class BirthdayProblem
