/*
* Design a class to overload a function compare( ) as follows: 
*1. void compare(int, int) — to compare two integers values and print the greater of the two integers. 
* 2. void compare(char, char) — to compare the numeric value of two characters and print with the higher numeric value. 3. void compare(String, String) — to compare the length of the two strings and print the longer of the two. 
*/

public class Question17 {
    public static int compare(int a, int b) {
        return a > b ? a : b;
    }

    public static char compare(char a, char b) {
        return a > b ? a : b;
    }

    public static String compare(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    public static void main(String args[]) {
        System.out.println(compare(100, 200));
        System.out.println(compare('a', 'z'));
        System.out.println(compare("Hello, Java!", "Java!"));
    }
}
