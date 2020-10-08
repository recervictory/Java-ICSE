/*
* Code: Printing Following Pattern in screen
*   *
*   **
*   ***
*   ****
*   *****
*   ******
* Author: Victor Banerjee
*/

import java.util.*;

public class Pettern01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } // define Columns
            System.out.println(); // define row
        }
        in.close();
    }
}
