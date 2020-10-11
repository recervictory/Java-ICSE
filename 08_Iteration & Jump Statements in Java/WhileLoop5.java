/* 
* Code: Implement WhileLoop
* Author : Aditya
* Modified by: Victor Banerjee
*/

import java.util.*;

public class WhileLoop5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int conter = 0;
        while (conter != num) {
            conter += 1;
            System.out.println("The value of conter : " + conter);
        }
        sc.close();
    }
}