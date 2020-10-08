/*
Code : Implement Pattern Pyramid
       *
      * *
     * * *
    * * * *
Author: Victor Banerjee
*/

import java.util.*;

public class Pattern06 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        int i, j;
        int k = 2 * n - 2; // k defines number of spaces between
        for (i = 0; i < n; i++) {
            for (j = 0; j <= k; j++) {
                System.out.print(" "); // printing spaces
            }
            k--; // space decrease each line
            for (j = 0; j <= i; j++) {
                System.out.print("* "); // printing stars
            }
            System.out.println(); // ending line after each row
        }
    }
}
