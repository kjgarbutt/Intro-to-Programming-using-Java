import java.util.*;
public class Age {
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    String dob, month;
    long age, temp, day, months, year, dd, mm, yy, ww;
    Scanner scan = new Scanner(System.in);
    Integer i = 10;
    @SuppressWarnings("static-access")
    public Age(String name) {
        mm = calendar.MONTH;
        if (mm == 11) {
            month = "Dec";
        } else if (mm == 10) {
            month = "Nov";
        } else if (mm == 9) {
            month = "Oct";
        } else if (mm == 8) {
            month = "Sep";
        } else if (mm == 7) {
            month = "Aug";
        } else if (mm == 6) {
            month = "Jul";
        } else if (mm == 5) {
            month = "Jun";
        } else if (mm == 4) {
            month = "May";
        } else if (mm == 3) {
            month = "Apr";
        } else if (mm == 2) {
            month = "Mar";
        } else if (mm == 1) {
            month = "Feb";
        } else {
            month = "Jan";
        }
        name = "Your";
    }
    public long input(String name) {
        try {
            System.out.printf(name + " Date Of Birth (Example: " + month + "-" + (date.getDate()) + "-" + calendar.getWeekYear() + ") : ");
            dob = scan.nextLine();
            age = compute(dob);
        } catch (InputMismatchException e) {
            System.err.println("Error Occur!" + e.getMessage());
            System.exit(0);
        }
        daysOld();
        return age;
    }
    public long compute(String dob) {
        try {
            System.out.println("Current Date: " + (date = new Date()));
            date = new Date(dob);
            System.out.println("Date Of Birth: " + date);
            day = date.getDate();
            months = date.getMonth();
            year = date.getYear();
            date = new Date();
            dd = date.getDate();
            mm = date.getMonth();
            yy = date.getYear();
            age = yy - year;
            if (mm < months) {
                age--;
            }
            if (months == mm && dd < day) {
                age--;
            }
        } catch (Exception e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
        return age;
    }
    public void daysOld() {
        int leap = 0, year1, year2;
        long mill1, mill2, diff, days;
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        date = new Date();
        year1 = date.getYear();
        cal2.set(date.getYear(), date.getMonth(), date.getDate());
        date = new Date(dob);
        year2 = date.getYear();
        cal1.set(date.getYear(), date.getMonth(), date.getDate());
        mill1 = cal1.getTimeInMillis();
        mill2 = cal2.getTimeInMillis();
        diff = mill2 - mill1;
        days = diff / (24 * 60 * 60 * 1000);
        for (i = year2; i <= year1; i++) {
            if (i % 4 == 0) {
                leap++;
            }
        }
        dd = days;
        yy = days / 365;
        days %= 365;
        mm = days / 31;
        days %= 31;
        ww = days / 7;
        days %= 7;
        date = new Date(dob);
        if (date.before(date = new Date())) {
            System.out.println("Age: " + age + " Years , " + mm + " Months ,  " + ww + " Weeks & " + (days + leap) + " Days Old (Total " + (dd) + " Days & " + leap + " LY Day(s) Including)!");
        } else {
            System.err.println("Invalid Date Of Birth!\nCurrent Date is " + (date = new Date()) + " & your Date Of Birth is " + (date = new Date(dob)));
        }
    }
    public static void main(String[] args) {
        Age Ag = new Age("");
        String name = "Your";
        Ag.input(name);
    }
}