/*
* Design a class overloading a function calculate() as follows: 
* 1. void calculate(int m, char ch) with one integer argument and one character argument. It checks whether the integer argument is divisible by 7 or not, if ch is 's', otherwise, it checks whether the last digit of the integer argument is 7 or not.
* 2. void calculate(int a, int b, char ch) with two integer arguments and one character argument. It displays the greater of integer arguments if ch is 'g' otherwise, it displays the smaller of integer arguments.
*/

public class Question16 {
    public static void calculate(int m, char ch) {
        if (ch == 's') {
            System.out.println("is Divisible by 7 ? " + (m % 7 == 0));
        } else {
            System.out.println("is last digit by 7 ? " + (m % 10 == 7));
        }
    }

    public static void calculate(int a, int b, char ch) {
        int result = ch == 'g' ? (a > b ? a : b) : (a > b ? b : a); // if (ch==g)
        System.out.println(result);
    }

    public static void main(String args[]) {
        calculate(1, 4, 'g'); // 4
        calculate(17, 's');
        calculate(1, 4, 't'); // 1
        calculate(17, 'l');
    }
}
