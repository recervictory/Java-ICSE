
/*
Code: Code takes number as input and returns if number is positive,negative or zero.
Author: Victor Banerjee
*/
import java.util.*;

public class Positive {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a Number");
        n = in.nextInt();
        // Conditional Statement
        if (n > 0) {
            System.out.println("A positive number");
        } else if (n < 0) {
            System.out.println("A negative number");
        } else {
            System.out.println("Equal to Zero");
        }
        in.close();
    }
}
