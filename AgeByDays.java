/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

import java.text.DecimalFormat;

public class AgeByDays     {
     public static void main(String [] args)     {

     DecimalFormat df = new DecimalFormat("#,###");
     
     int age, months;
     double days, hours, minutes, seconds;
     
     TextIO.put("Enter your age in years:  ");
     age = TextIO.getlnInt();
     
     months = (age * 12);
     days = (age * 365);
     hours = (days * 24);
     minutes = (hours * 60);
     seconds = (minutes * 60);
  
     TextIO.putln();
	 TextIO.putln("You are " + (df.format(months)) + " months old! That's "
          + (df.format(days)) + " days. Or " + (df.format(hours)) + " hours.");
     TextIO.putln("Or " + (df.format(minutes)) + " minutes. Or a staggering "
          + (df.format(seconds)) + " seconds!");
     }
}