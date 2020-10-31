/*
* Code: Implement math random to generate number in range
* Author : Victor Banerjee
* Date : 31-Oct-2020
*/

public class RangeRandom {
    public static double random(double min,double max) {
        double random = Math.random() * (max - min) + min;
        return random;
    }
    public static void main(String[] args) {
        for(int i = 0; i <100;i++) {
            System.out.print((int)(random(i,100)) + "\t");
        }
    }
}
