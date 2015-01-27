/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program performs the following type of experiment:
 * Given a desired total roll, such as 7, roll a pair of
 * dice until the given total comes up, and count how many
 * rolls are necessary.  Now do the experiment over and over,
 * and find the average number of rolls.  The number of times
 * the experiment is repeated is given by the constant,
 * NUMBER_OF_EXPERIMENTS.  Several statistics are computed and
 * printed out for each possible roll = 2, 3, ..., 12:
 * the average number of rolls, the standard deviation,
 * and the maximum number of rolls.
 */

public class DiceRollStats2 {

  static final int NUMBER_OF_EXPERIMENTS = 10000;
  			// Sets a static variable, 10000, to improve readability
  
  private static PairOfDice2 dice = new PairOfDice2();
            // A single pair of dice, which will be used for all
            // the experiments.

  
  public static void main(String[] args) {
  
      System.out.println("Dice Total  Avg # of Rolls  Stand. Deviation  Max # of Rolls");
      System.out.println("----------  --------------  ----------------  --------------");
      			// Creates the column headers

      for ( int total = 2;  total <= 12;  total++ ) {
    	  // for 'total' that is EQUAL to 2 & LESS THAN/EQUAL to 12, iterate++
          StatCalc stats;  // An object that will compute the statistics.
          stats = new StatCalc();
          for ( int i = 0; i < NUMBER_OF_EXPERIMENTS; i++ ) {
              // As long as 'i; is less than 10,000, iterate++...
        	  		// Do the experiment of counting the number of rolls
                	// required to roll the desired total, and enter the
                	// number of rolls into stats' dataset.
            stats.enter( rollFor(total) );
            	// Add a number to 'stats', which is a new run of StatCalc()
            		// The statistics will be computed for all the numbers that
            		// have been added to the dataset using this method.
          }
          
          System.out.printf("%6d", total);
          System.out.printf("%18.3f", stats.getMean());
          System.out.printf("%19.3f", stats.getStandardDeviation());
          System.out.printf("%14.3f", stats.getMax());
          System.out.println();
          	// Print out the stats
      }
      
  } // end main
  
  /**
    * rollFor() method
    * Roll the dice repeatedly until the total on the
    * two dice comes up to be N.  N MUST be one of the numbers
    * 2, 3, ..., 12.  (If not, this routine will go into an
    * infinite loop!).  The number of rolls is returned.
    */
  static int rollFor( int N ) {
      int rollCt = 0;  // 'rollCt' = Number of rolls made
      do {
          dice.roll();
          rollCt++;
      } while ( dice.getTotal() != N );
      return rollCt;
      	// Do the following:
      		// roll the dice and assign to 'dice'...
      		// and iterate++ the roll count
      	// While 'dice', which is the total of die1+die2 in PairOfDice2,
      	// is NOT EQUAL to N...
      	// Then return the roll count
      	
  }
  
}  // end class DiceRollStats2