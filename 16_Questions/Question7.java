/*
! Code: - Question 7 
* Write a program to input a number and check whether it is 'Magic Number' or not. Display the message accordingly. A number is said * to be a magic number if the eventual sum of digits of the number is one. Sample Input : 55 Then, 5 + 5 = 10, 1 + 0 = 1 Sample * 
* Output: Hence, 55 is a Magic Number. Similarly, 289 is a Magic Number. 
*/

import java.util.*;
public class Question7 {
    public static int RecursiveSumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum *= n % 10;
            // System.out.println(n + " " + (n % 10));
            n = n / 10;
        }
        System.out.println(sum);
        if (sum > 9)
            return RecursiveSumOfDigits(sum);
        else
            return sum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println(RecursiveSumOfDigits(num) == 1);
        in.close();
    }
}