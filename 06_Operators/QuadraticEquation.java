
/**
 * Code: Calculate root of x by  a,b and c as Input QuadraticEquation: .
 * (ax^2 + bx + c = 0)
 * @author (Victor Banerjee)
 * @version (9.10.2020)
 * x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a
 */

import java.util.*;
public class QuadraticEquation
{
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = in.nextInt();
        System.out.println("Enter value of b: ");
        int b = in.nextInt();
        System.out.println("Enter value of c: ");
        int c = in.nextInt();
        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a); // 1st Root
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a); // 2nd Root
        
        System.out.println("X 1st Root: "+x1);
        System.out.println("X 2nd Root: "+x2);
    } 
}

