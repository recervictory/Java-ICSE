
/**
 * Implement Calendar from year.
 *
 * @author (Victor Banerjee)
 * @version (1.0)
 */

import java.util.*;

public class Calendar {
    // Function return Number of Days in a month
    public static int daysInMonth(String monthName, int year) {
        String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (((year % 4) == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
            days[2] = 29; // if leap year
        }
        int monthDays = 0;
        for (int i = 1; i <= 12; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                monthDays = days[i];
            }
        }
        return monthDays;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the month:");
        String month = in.next();
        System.out.print("Enter the Number of Year (YYYY) :");
        int year = in.nextInt();
        int numDays = daysInMonth(month, year);
        System.out.println(month +", " + year +" : "+ numDays+" Days");

    }
}
