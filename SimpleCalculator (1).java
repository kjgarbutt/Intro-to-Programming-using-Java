/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 *
 * This program evaluates simple expressions such as 2 + 2
 * and 34.2 * 7.81, consisting of a number, an operator,
 * and another number.  The operators +, -, *, / are allowed.
 * The program will read and evaluate expressions until
 * the user inputs a line that starts with the number 0.
 */

public class SimpleCalculator {

  public static void main(String[] args) {
  
      double firstNum;		// The first number in the expression.
      double secondNum;		// The second number in the expression.
      char operator;		// The Operator in the expression (+,-,*,/).
      double value;			// The value of the expression once computed
      
      // Print out the command
      System.out.println("Please enter a calculation.");
      System.out.println("NOTE: the expression should be in the format:");
      System.out.println("2 + 2  or  34.2 * 7.81 or 11 / 3.");
      System.out.println("Please use any of the basic operators: +, -, * or /.");
      System.out.println("Spacing isn't an issue: 2+2 will be read as easily as 2 + 2.");
      System.out.println("To end, enter a 0.");
      System.out.println();
      
      while (true) {
          
          /* Get user's input, ending program if first number is 0. */
      
          System.out.print("Enter your calculation here: ");
          firstNum = TextIO.getDouble();	// Gets the first number entered by the user
          if (firstNum == 0)				// If first number is a 0
            break;								// Then break out of the while loop and go to "Good Bye!"
          operator = TextIO.getChar();		// Gets the operator entered by user (a Char character)
          secondNum = TextIO.getlnDouble();	// Gets the second number entered by the user
          
          /* Compute the value of the expression using a Switch statement. */
          
          switch (operator) {
              case '+':
                value = firstNum + secondNum;
                break;	// The 'break' allows us to end the Switch when the correct operator
                		// has been found
              case '-':
                value = firstNum - secondNum;
                break;
              case '*':
                value = firstNum * secondNum;
                break;
              case '/':
                value = firstNum / secondNum;
                break;
              default:
                System.out.println("You entered an unknown operator: " + operator);
                System.out.println("Please try again.");
                System.out.println();
                continue;  // Back to start of loop!
          } // end switch statement
          
          /*
			Could have used an if statement, instead of Switch:
            	if ( operator == '+' )
				   value = firstNum + secondNum;
				else if ( operator == '-' )
				   value = firstNum - secondNum;
				else if ( operator == '*' )
				   value = firstNum * secondNum;
				else if ( operator == '/' )
				   value = firstNum / secondNum;
				else {
				   System.out.println("Unknown operator: " + operator);
				   continue;  // back to start of loop
				}
           */
          
          /* Display the value. */
          
          System.out.println();
          System.out.println("Value is " + value);
          System.out.println();
                    
      } // end while
      
      System.out.println();
      System.out.println("Good bye!");
  
  }  // end main()

}  // end class SimpleCalculator