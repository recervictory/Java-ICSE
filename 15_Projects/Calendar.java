
/**
 * Implement Calendar from year.
 *
 * @author (Victor Banerjee)
 * @version (1.1)

 */

import java.util.*;

public class Calendar {
    // Function return Number of Days in a month
    public static int[] daysInMonth(String monthName, int year) {
        String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (((year % 4) == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
            days[2] = 29; // if leap year
        }
        int[] monthDays = { 0, 0 };
        for (int i = 1; i <= 12; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                monthDays[0] = i;
                monthDays[1] = days[i];
            }
        }
        return monthDays;
    }

    // Fuction return the first day code of the given year an month
    public static String zelleRule(int day, int month, int year) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        if (month < 3) {
            month++;
            year--;
        }
        ;
        int Y = year % 100, C = (year - Y) / 100;
        int f = (Y + (Y / 4) + (C / 4) - 2 * C + (26 * (month + 1) / 10) + day - 1);
        // Zeller's Rule:
        // https://en.wikipedia.org/wiki/Zeller%27s_congruence
        return f < 0 ? days[(f % 7 + 7) % 7] : days[f % 7];
    }

    // Function generate the calender array
    public static int[][] calenderArray(int year, int monthDays, String monthName) {
        int cal[][] = new int[6][7];
        return cal;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the month (e.g March): ");
        String month = in.next();
        System.out.print("Enter the Number of Year (YYYY) : ");
        int year = in.nextInt();
        int[] numDays = daysInMonth(month, year);

        in.close();
    }
}
