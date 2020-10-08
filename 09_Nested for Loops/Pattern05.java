/*
* Code: Printing Following Pattern in screen
*   1
*   121
*   12321
*   1234321
*   123454321
* Author: Victor Banerjee
*/

import java.util.*;

public class Pattern05 {
    public static void main(String args[]) {
        int i, j, k;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = in.nextInt();
        for (i = 1; i <= n; i++) { // line
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        } // j loop end
    } //
}