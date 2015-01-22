/*
Implements a simple guessing game.  The computer selects a random
number in the range 1 to 100, inclusive, and the user tries to guess
it.  The user gets up to six guesses.  After each wrong guess, the
computer tells the user whether the guess was high or low.  If the
user guesses the number within six guesses, the user wins; if the user
makes six incorrect guesses, the user loses.  After the game ends,
the computer asks whether the user would like to play again.

Ask user to play a game (boolean do while loop)
	Do execute playGame
		While boolean response is true
Let computersNumber be a random number between 1 and 100
Let guessCount = 0
while (true):
    Get the user's guess
    Count the guess by adding 1 to guess count
    if the user's guess equals computersNumber:
        Tell the user he won
        break out of the loop
    if the number of guesses is 6:
        Tell the user he lost
        break out of the loop
    if the user's guess is less than computersNumber:
        Tell the user the guess was low
    else if the user's guess is higher than computersNumber:
        Tell the user the guess was high
End game
*/

public class GuessingGame {
	
	public static void main(String[] args)	{
		System.out.println("Let's play a game! I'll pick a number between");
		System.out.println("1 and 100, and you try to guess it,");
		boolean playAgain;
		// while playAgain is true (y), do (execute) playGame()
		do	{
			playGame();	// call subroutine to play game
			System.out.println("Would you like to play again? (y or n)");
			playAgain = TextIO.getlnBoolean();	// Boolean: if user responds y (true), do
		} while (playAgain);	// while playAgain is true...
		System.out.println("Thanks for playing. Goodbye!");
		}	// end of main()
	
	static void playGame()	{
		int computersNumber;	// A random number picked by the computer
		int usersGuess;			// Number entered by user as a guess
		int guessCount;			// Number of guesses made by user
		computersNumber = (int)(100 * Math.random()) + 1;
				// The value assigned to computersNumber is a randomly
				// chosen integer between 1-100, inclusive
		guessCount = 0;	// Assign 0 to guessCount
		System.out.println();
		System.out.println("What is your first gues?");
		
		/*
		 * The while loop:
		 * 	while (true):
		 * 		Get the user's guess
		 * 		Count the guess by adding 1 to guess count
		 * 		if the user's guess equals computersNumber:
		 * 			Tell the user he won
		 * 			break out of the loop
		 * 		if the number of guesses is 6:
		 * 			Tell the user he lost
		 * 			break out of the loop
		 * 		if the user's guess is less than computersNumber:
		 * 			Tell the user the guess was low
		 * 		else if the user's guess is higher than computersNumber:
		 * 			Tell the user the guess was high
		 */
		
		while (true)	{							// While the usersGuess exists...
			usersGuess = TextIO.getInt();	// Get the user's guess
			guessCount++;					// iterate up guessCount
			if (usersGuess == computersNumber)	{	// ...and IF usersGuess is EQUAL to computersNumber...
				System.out.println("You got it in " + guessCount
						+ " guesses! My number was " + computersNumber);
				break;								// Then break as game is over. The user won.
			}
			if (guessCount == 6){					//...and IF guessCount is EQUAL to 6...
				System.out.println("You didn't get the number in 6 guesses.");
				System.out.println("You lose. My number was " + computersNumber);
				break;								// Then break as game is over; the user lost.
			}
			// If we get to this point, the game continues
			// Tell the user if the guess was too high or too low
			if (usersGuess < computersNumber)		// ...and IF usersGuess is LESS than computersNumber...
				System.out.print("That's too low. Try again: ");
			else if (usersGuess > computersNumber)	//...ELSE IF usersGuess must be GREATER than computersNumber...
				System.out.print("That's too high. Try again: ");
		}
		System.out.println();	
	}	// end of playGame()
}	// end of class GuessingGame
