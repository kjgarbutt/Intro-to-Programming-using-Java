/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 * 
 * This program performs the following type of experiment:  Given a desired 
 * total roll, such as 7, roll a pair of dice until the given total comes up, 
 * and count how many rolls are necessary.  Now do that over and over, and
 * find the average number of rolls.  The number of times the experiment is 
 * repeated is given by the constant, NUMBER_OF_EXPERIMENTS.  The average is
 * computed and printed out for each possible roll = 2, 3, ..., 12. 
 */

public class DiceRollStats {

  /**
    * The number of times that the experiment "roll for a given total"
    * is to be repeated.  The program performs this many experiments, and
    * prints the average of the result, for each possible roll value, 
    */
  public static final int NUMBER_OF_EXPERIMENTS = 10000;	// set a constant

  public static void main(String[] args) {
      double average;  // The average number of rolls to get a given total.
      System.out.println("Total On Dice    Average Number of Rolls");
      System.out.println("-------------    -----------------------");
      for ( int dice = 2;  dice <= 12;  dice++ ) {	// for dice, which is = 2 AND LESS/EQUAL to 12, iterate...
          average = getAverageRollCount( dice );	// ...and assign the return value of 'avergaeRollCount' to 'average'
          System.out.printf("%10d%22.4f\n", dice, average);
            // Use 10 spaces to output dice, and use 22 spaces to output
            // average, with 4 digits after the decimal.
      }
  } 
  
  /**
    * Find the average number of times a pair of dice must be rolled to get
    * a given total.  The experiment of rolling for the given total is
    * repeated NUMBER_OF_EXPERIMENTS times and the average number of rolls
    * over all the experiments is computed.
    * Precondition:  The given total must be be between 2 and 12, inclusive.
    * @param roll the total that we want to get on the dice
    * @return the average number of rolls that it takes to get the specified
    *    total
    */
  public static double getAverageRollCount( int roll ) {
      int rollCountThisExperiment;  // Number of rolls in one experiment.
      int rollTotal;  // Total number of rolls in all the experiments.
      double averageRollCount;  // Average number of rolls per experiment.
      rollTotal = 0;
      for ( int i = 0;  i < NUMBER_OF_EXPERIMENTS;  i++ ) {
          rollCountThisExperiment = rollFor( roll );
          rollTotal += rollCountThisExperiment;
          // For i, which is 0, AND LESS than 10000, iterate i
          //	assign the return value of rollFor to the number of rolls for this experiment
          //	and ADD rollCountThisExperiment to rollTotal
      }
      averageRollCount = ((double)rollTotal) / NUMBER_OF_EXPERIMENTS;
      	// Divide the rollTotal by 10,000 to get the average...
      return averageRollCount;	// and return it
  }
  
  /**
    * Simulates rolling a pair of dice until a given total comes up.
    * Precondition:  The desired total is between 2 and 12, inclusive.
    * @param N the total that we want to get on the dice
    * @return the number of times the dice are rolled before the
    *    desired total occurs
    * @throws IllegalArgumentException if the parameter, N, is not a number
    *    that could possibly come up on a pair of dice
    */
  public static int rollFor( int N ) {
      if ( N < 2 || N > 12 )      // if N is LESS 2 than OR MORE than 12, THROW exception
         throw new IllegalArgumentException("Impossible total for a pair of dice.");
      int die1, die2;  // Numbers between 1 and 6 representing the dice.
      int roll;        // Total showing on dice.
      int rollCt;      // Number of rolls made.
      rollCt = 0;
      do {           // do the following...
         die1 = ( int)(Math.random()*6) + 1;
         die2 = ( int)(Math.random()*6) + 1;     // random roll for die2
         roll = die1 + die2;      // roll = sum of die1 + die2
         rollCt++;   // iterate up roll count
      } while ( roll != N );     // ...while 'roll' is NOT equal to N
      return rollCt;       // return the roll count
  }  
}  // end DiceRollStats