/**
 * The following is part of Introduction to Programming
 * Using Java (7th Edition) by David J. Eck  (eck@hws.edu).
 * The code is originally taken directly from the book and
 * may or may not be altered in some way as I learn Java.
 * Kurtis Garbutt (kurtis.garbutt@gmail.com)
 */

import java.util.Calendar;
import java.util.Date;
 
public class LiveDays {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.set(1985, Calendar.JANUARY, 30);
        Date birthday = cal.getTime();
 
        long dateSubtract = today.getTime() - birthday.getTime();
        long time = 1000 * 60 * 60 * 24;
        System.out.println("我已經活了 " + dateSubtract / time + " 天");
    }
}