/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

public class CLDemo {
 
  public static void main(String[] args) {
      System.out.println("You entered " + args.length
                                  + " command-line arguments");
      if (args.length > 0) {
        System.out.println("They were:");
        for (int i = 0; i < args.length; i++)
            System.out.println("  " + args[i]);
      }
  } // end main()
 
} // end class CLDemo
