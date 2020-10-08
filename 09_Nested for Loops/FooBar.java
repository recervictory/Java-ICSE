
/*
Code: Implement FooBar
Author: Victor Banerjee
*/
import java.util.*;
public class FooBar {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a Number");
        n = in.nextInt();
        System.out.println("Loops Start");
        // Loop start
        for (int i = 1; i <= n; i++) {
            // print the int values
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.print(i + "\t");
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("Foo");
            }
            if (i % 5 == 0) {
                System.out.print("Bar");
            }
            System.out.print("\t");
        }
        in.close();
    }
}
