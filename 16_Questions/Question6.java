/*
* Question 6:
* Using a switch statement, write a menu driven program to: 
* (a) generate and display the first 10 terms of the Fibonacci series 0, 1, 1, 2, 3, 5 ,8, 13 The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two. 
* (b) find the sum of the digits of an integer that is input by the user. Sample Input: 15390 Sample Output: Sum of the digits = 18 For an incorrect choice, an appropriate error message should be displayed. 
*/
import java.util.*;

public class Question6 {
    public static void fibonacci(int n) {
        int a = 0, b = 1, sum = a + b;
        System.out.print("0 1 ");
        for (int i = 3; i <= 10; i++) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
        }
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            // System.out.println(n + " " + (n % 10));
            n = n /10 ;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("a. Fibonacci Series : \nb. Sum of Digits: ");
        System.out.print("Enter your choice (a or b): ");
        char ch = in.next().charAt(0); 
        switch (ch) {
            case 'a':
                System.out.println("Fibonacci series :");
                fibonacci(10);
                break;
            case 'b':
                System.out.print("Enter a Number : ");
                int n = in.nextInt();
                System.out.println("Sum of Digits : " + sumOfDigits(n));
                break;
            default:
                break;
        }
    }
}
