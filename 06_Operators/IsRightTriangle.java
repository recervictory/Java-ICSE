
/**
 * Check if the three side given from the user is a RightAngleTriangle
 * @author (Victor Banerjee)
 * @version (1.0)
 */

import java.util.*;
public class IsRightTriangle
{
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three side of Triangle");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        boolean isSideZero = a == 0 || b == 0 || c == 0;
        boolean isTriangle = a + b > c && b + c > a && c + a > b;
        boolean isRightAngle = a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a;
        
        System.out.println(isTriangle && isRightAngle && !isSideZero);
    }
}
