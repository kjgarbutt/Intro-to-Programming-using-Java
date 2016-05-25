/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

package com.kushal.utils.date;
import java.util.GregorianCalendar;
import java.util.Calendar;
 
public class DateHelper {
	 
	public static void main(String[] args) {

	/**
	* Month Representations
	*/
	static final int JAN = 0;
	static final int FEB = 1;
	static final int MAR = 2;
	static final int APR = 3;
	static final int MAY = 4;
	static final int JUN = 5;
	static final int JUL = 6;
	static final int AUG = 7;
	static final int SEP = 8;
	static final int OCT = 9;
	static final int NOV = 10;
	static final int DEC = 11;

	System.out.println("Born In 1982-JUL-11. Current Age: "
			+ calculateMyAge(1982, JUL, 11));
		System.out.println("Born In 1957-DEC-09. Current Age: "
			+ calculateMyAge(1957, DEC, 9));
	}
	 
	/**
	*
	* @param year --> Birth Year
	* @param month --> Birth Month
	* @param day --> Birth Day
	* @return --> Calculated Age
	*/
	
	private static int calculateMyAge(int year, int month, int day) {
		Calendar birthCal = new GregorianCalendar(year, month, day);
	 
		Calendar nowCal = new GregorianCalendar();
	 
		int age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
	 
		boolean isMonthGreater = birthCal.get(Calendar.MONTH) >= nowCal
			.get(Calendar.MONTH);
	 
		boolean isMonthSameButDayGreater = birthCal.get(Calendar.MONTH) == nowCal
			.get(Calendar.MONTH)
		&& birthCal.get(Calendar.DAY_OF_MONTH) > nowCal
			.get(Calendar.DAY_OF_MONTH);
	 
		if (isMonthGreater || isMonthSameButDayGreater) {
			age=age-1;
		}
	
	return age;
	
	}
}

/**
 * @Author Kushal Paudyal
 * www.sanjaal.com/java
 * Last Modified On 2009-10-13
 *
 * Takes any birth date as input
 * Calculates the current age
 */