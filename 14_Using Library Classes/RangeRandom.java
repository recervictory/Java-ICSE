/*
* Code: Implement math random to generate number in range
* Author : Victor Banerjee
* Date : 31-Oct-2020
* Version : 1.2
*/
import java.util.*;
public class RangeRandom {
    public static double random(double min,double max) {
        double random = Math.random() * (max - min) + min;
        return random;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower bound :");
        int low = in.nextInt();
        System.out.print("Enter the higer bound :");
        int high = in.nextInt();
        System.out.println("Ten Rondom Intger :");
        for(int i = 0; i < 10; i++) {
            System.out.print((int)random(low, high) + "\t");
        }
        in.close();
    }
}
