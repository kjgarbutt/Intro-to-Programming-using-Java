/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 *
 */

public class tempIf {
	public static void main(String [] args)	{
		
		TextIO.put("What is the current temperature: "); // print command
		int temperature = TextIO.getlnInt(); // assign user input as variable 'inputNumber'
	    System.out.println();
		if (temperature < 0)
		     System.out.println("It’s very cold out! You need a jumper!");
		else if (temperature < 10)
		     System.out.println("It’s pretty chilly. I'd still recommend a jumper.");
		else if (temperature < 20)
		     System.out.println("It’s really nice out. Leave that jacket at home.");
		else
		     System.out.println("It’s hot as hell! Get an ice cream!");
	}
}
