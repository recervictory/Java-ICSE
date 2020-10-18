
/**
 * Code : Find Numbers of Day in Month
 *
 * @author (Victor Banerjee)
 * @version (1.0)
 */
import java.util.*;

public class MonthDaysSwitch {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numDays = 0;
        System.out.print("Enter the Number of Month (1-12) :");
        int month = in.nextInt();
        System.out.print("Enter the Number of Year (YYYY) :");
        int year = in.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 31;
                break;
            case 2:
                if (((year % 4) == 0) && !(year % 100 == 0) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
        }
        System.out.println("Number of Days in Year **" + year + "** in month : " + numDays);
        in.close();
    }
}
