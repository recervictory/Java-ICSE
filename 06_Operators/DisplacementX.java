
/**
 * Write a description of class DisplacementX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class DisplacementX {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of X0: ");
        int x0 = in.nextInt();
        System.out.print("Enter value of V0: ");
        int v0 = in.nextInt();
        System.out.print("Enter value of t: ");
        int t = in.nextInt();
        System.out.print("Enter value of a: ");
        int a = in.nextInt();
        double x = x0 + v0 * t + 0.5 * a * t * t;
        System.out.println("Displacement(x): " + x);
        in.close();
    }
}
