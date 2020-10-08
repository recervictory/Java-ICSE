/*
Code: A program to display Sum or Product of three Numbers as per user choice
Author: Victor Banerjee
*/

import java.io.*;

public class SumOrProduct {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a, b, c, sum = 0, pr = 1;
        char ch;
        System.out.println("Enter three numbers");
        a = Integer.parseInt(in.readLine()); // Integer Input
        b = Integer.parseInt(in.readLine());
        c = Integer.parseInt(in.readLine());
        System.out.println("Enter 's' for sum and 'p' for products of three numbers");
        ch = (char) in.read(); //convert to char
        
        // conditional Statement
        if (ch == 's') {
            sum = a + b + c;
            System.out.println("Sum : " + sum);
        } else if (ch == 'p') {
            pr = a * b * c;
            System.out.println("Product : " + pr);
        } else
            System.out.println("Invalid Input ");
    }
}
