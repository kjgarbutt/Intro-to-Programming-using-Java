/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program simulates rolling a pair of dice until they
 * come up snake eyes.  It reports how many rolls were needed.
 * By adding in the two die carriage returns (println) after each
 * roll, it shows the working. I didn't trust the original. 
 */

public class SnakeEyes {
  
  public static void main(String[] args) {
  
      int die1, die2;  // The values rolled on the two dice.
      
      int countRolls;  // Used to count the number of rolls.
      
      countRolls = 0;
      
      //A simple do...while loop
      // Do this...
      		// roll die1 (produce random number between 1-6
      		// roll die2 (produce random number between 1-6
      		// increment up the count of rolls by 1
      // While...
      		// die1 is NOT equal to 1 AND die2 is NOT equal to 1
      do {
          die1 = (int)(Math.random()*6) + 1;  // roll the dice
          System.out.println("Die 1 = " + die1);
          die2 = (int)(Math.random()*6) + 1;
          System.out.println("Die 2 = " + die2);
          countRolls++;                        // and count this roll
      } while ( die1 != 1 || die2 != 1 );
      
      System.out.println("It took " + countRolls + " rolls to get snake eyes.");
  
  }  // end main()

}  // end class