- Question 1 
Write a program to input a number and check and print whether it is a Pronic number or not. [Pronic number is the number which is the product of two consecutive integers.] Examples: 12 = 3 * 4 20 = 4 * 5 42 = 6 * 7
import  java.util.*;
public class PronicNumber 
{
public static void main(String args[])
       {
        int num,ans=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        num=in.nextInt();
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }
         if(ans == 1)
         System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }}




- Question 2 
A prime number is said to be 'Twisted Prime', if the new number obtained after reversing the digits is also a prime number. Write a program to accept a number and check whether the number is 'Twisted Prime' or not. Sample Input: 167 Sample Output: 761 167 is a 'Twisted Prime'. 
import java.util.*;  
class Twisted_Prime   
{ 
   public static void main(String[] args)  
    {  
    int n, reverse,sum=0 , flag;  
    Scanner sc = new Scanner(System.in);      
    System.out.println("Enter the prime number?");  
    n = sc.nextInt();  
    while(n!=0)  
        {  
        reverse = n%10;  
        sum = sum*10 + reverse;  
        n= n/10;  
        }  
    flag = 0;  
    for (int j = 2; j <= sum / 2; j++)  
    {  
        if ((sum % j) == 0)  
        {  
            flag = 1;  
            break;  
        }  
    }  
    if (flag == 0)  
            System.out.println("Twisted Prime");  
     else  
            System.out.println("Not Twisted Prime");  
}  
}  
 


- Question 3 
A number is said to be Duck if the digit zero is (0) present in it. Write a program to accept a number and check whether the number is Duck or not. The program displays the message accordingly. (The number must not begin with zero) Sample Input: 5063 Sample Output: It is a Duck number. Sample Input: 7453 Sample Output: It is not a Duck number. 

- Question 4 
Write a program to input a number. Check and display whether it is a Niven number or not. (A number is said to be Niven which is divisible by the sum of its digits). Example: Sample Input 126 Sum of its digits = 1 + 2 + 6 = 9 and 126 is divisible by 9. 

- Question 5 
Write a program to accept a number and check whether it is a 'Spy Number' or not. (A number is spy if the sum of its digits equals the product of its digits.) Example: Sample Input: 1124 Sum of the digits = 1 + 1 + 2 + 4 = 8 Product of the digits = 1*1*2*4 = 8

- Question 6 
Using a switch statement, write a menu driven program to: 
(a) generate and display the first 10 terms of the Fibonacci series      0, 1, 1, 2, 3, 5 The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two. 
(b) find the sum of the digits of an integer that is input by the user. Sample Input: 15390 Sample Output: Sum of the digits = 18 For an incorrect choice, an appropriate error message should be displayed. 

- Question 7 
Write a program to input a number and check whether it is 'Magic Number' or not. Display the message accordingly. A number is said to be a magic number if the eventual sum of digits of the number is one. Sample Input : 55 Then, 5 + 5 = 10, 1 + 0 = 1 Sample Output: Hence, 55 is a Magic Number. Similarly, 289 is a Magic Number. 

- Question 8 
Write the programs to display the following patterns:     
- Question 9 
Write a menu driven program using a method Number() to perform the following tasks: 
1. Accept a number from the user and display it in its Binary Equivalents. For example: Sample Input: (21)10  Sample Output: (10101)2 2. Accept a binary number from the user and display it in its Decimal Equivalents. For example: Sample Input: (11101)2 Sample Output: (29)10 
- Question 10 
An electronics shop has announced a special discount on the purchase of Laptops as given below: 
Category Discount on Laptop 
Up to ₹25,000 5.0% 
₹25,001 - ₹50,000 7.5% 
₹50,001 - ₹1,00,000 10.0% 
More than ₹1,00,000 15.0% Define a class Laptop described as follows: 
Data members/instance variables: 
1. name 2. price 3. dis 4. amt 
Member Methods: 
1. A parameterised constructor to initialize the data members 2. To accept the details (name of the customer and the price) 3. To compute the discount 4. To display the name, discount and amount to be paid after discount. 
Write a main method to create an object of the class and call the member methods. 
- Question 11 
Write a program by using a class with the following specifications: 
Class name — Calculate 
Instance variables: 
1. int num 2. int f 3. int rev 
Member Methods:Calculate(int n) — to initialize num with n, f and rev with 0 (zero) 1. int prime() — to return 1, if number is prime 2. int reverse() — to return reverse of the number 3. void display() — to check and print whether the number is a prime palindrome or not 
- Question 12 
The population of a country in a particular year can be calculated by: p*(1+r/100) at the end of year 2000, where p is the initial population and r is the growth rate. 
Write a program by using a class to find the population of the country at the end of each year from 2001 to 2007. The Class has the following specifications: 
Class name — Population 
Data Members — float p,r 
Member Methods: 1. Population(int a,int b) — Constructor to initialize p and r with a and b respectively. 2. void print() — to calculate and print the population of each year from 2001 to 2007. 
- Question 13 
Define a class called Student to check whether a student is eligible for taking admission in class XI with the following specifications: 
Data Members Purpose String name to store name int mm to store marks secured in Maths int scm to store marks secured in Science double comp to store marks secured in Computer     
Write the main method to create an object of the class and call all the member methods. 
Member Methods 
Purpose 
Student( ) 
parameterised constructor to initialize the data members by accepting the details of a student check( ) to check the eligibility for course based on the table given below void display() to print the eligibility by using check() function in nested form 
Marks Eligibility 90% or more in all the subjects Science with Computer Average marks 90% or more Bio-Science Average marks 80% or more and less than 90% Science with Hindi 
- Question 14 
Write a class with the name Area using function overloading that computes the area of a parallelogram, a rhombus and a trapezium. 
Formula: 
Area of a parallelogram (pg) = base * ht 
Area of a rhombus (rh) = (1/2) * d1 * d2 (where, d1 and d2 are the diagonals) 
Area of a trapezium (tr) = (1/2) * ( a + b) * h (where a and b are the parallel sides, h is the perpendicular distance between the parallel sides) 
- Question 15 
Write a class with the name Perimeter using function overloading that computes the perimeter of a square, a rectangle and a circle. 
Formula: 
Perimeter of a square = 4 * s 
Perimeter of a rectangle = 2 * (l + b) 
Perimeter of a circle = 2 * (22/7) * r 
- Question 16 
Design a class overloading a function calculate() as follows: 
1. void calculate(int m, char ch) with one integer argument and one character argument. It checks whether the integer argument is divisible by 7 or not, if ch is 's', otherwise, it checks whether the last digit of the integer argument is 7 or not.
2. void calculate(int a, int b, char ch) with two integer arguments and one character argument. It displays the greater of integer arguments if ch is 'g' otherwise, it displays the smaller of integer arguments. 
- Question 17 
Design a class to overload a function compare( ) as follows: 
1. void compare(int, int) — to compare two integers values and print the greater of the two integers. 2. void compare(char, char) — to compare the numeric value of two characters and print with the higher numeric value. 3. void compare(String, String) — to compare the length of the two strings and print the longer of the two. 
 
- Question 18 
Write a program in Java to store 20 numbers (even and odd numbers) in a Single Dimensional Array (SDA). Calculate and display the sum of all even numbers and all odd numbers separately. 
- Question 19 
Write a program in Java to store 10 numbers (including positive and negative numbers) in a Single Dimensional Array (SDA). Display all the negative numbers followed by the positive numbers without changing the order of the numbers. Sample Input: 
n[0] n[1] n[2] n[3] n[4] n[5] n[6] n[7] n[8] n[9] 15 21 -32 -41 54 61 71 -19 -44 52  
Sample Output: -32, -41, -19, 44, 15, 21, 54, 61, 71, 52 
- Question 20 
Write a program in Java to store 20 numbers in a Single Dimensional Array (SDA). Display the numbers which are prime. Sample Input: 
n[0] n[1] n[2] n[3] n[4] n[5] ... n[16] n[17] n[18] n[19] 45 65 77 71 90 67 ... 82 19 31 52  
Sample Output: 71, 67, 19, 31 
- Question 21 
Write a program to accept name and total marks of N number of students in two single subscript arrays name[ ] and totalmarks[ ]. Calculate and print: (i) The average of the total marks obtained by N number of students. [average = (sum of total marks of all the students)/N] (ii) Deviation of each student's total marks with the average. [deviation = total marks of a student - average]   
- Question 22 
Write a program in Java using arrays: (a) To store the Roll No., Name and marks in six subjects for 100 students. (b) Calculate the percentage of marks obtained by each candidate. The maximum marks in each subject are 100. (c) Calculate the Grade as per the given criteria: 
Percentage Marks Grade From 80 to 100 A From 60 to 79 B From 40 to 59 C Less than 40 D  
- Question 23 
Write a program to accept a list of 20 integers. Sort the first 10 numbers in ascending order and next the 10 numbers in descending order by using 'Bubble Sort' technique. Finally, print the complete list of integers.  
- Question 24 
Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer and store all the even numbers in an array even[ ] and all the odd numbers in another array odd[ ]. Finally, print the elements of both the arrays.  
- Question 25 
Write a program to store 20 numbers in a Single Dimensional Array (SDA). Now, display only those numbers that are perfect squares.  
- Question 26 
Write a program to accept 10 numbers in a Single Dimensional Array. Pass the array to a function Search(int m[], int ns) to search the given number ns in the list of array elements. If the number is present, then display the message 'Number is present' otherwise, display 'number is not present'. 
- Question 27 
Write a program to store 6 elements in an array P and 4 elements in an array Q. Now, produce a third array R, containing all the elements of array P and Q. Display the resultant array. 
Input Input Output P[ ] Q[ ] R[ ] 4 19 4 6 23 6 1 7 1 2 8 2 3   3 10   10     19     23     7     8  
- Question 28 
A double dimensional array is defined as N[4][4] to store numbers. Write a program to find the sum of all even numbers and product of all odd numbers of the elements stored in Double Dimensional Array (DDA). 
- Question 29 
A Class Teacher wants to keep the records of 40 students of her class along with their names and marks obtained in English, Hindi, Maths, Science and Computer Science in a Double Dimensional Array (DDA) as M[40][5]. When the teacher enters the name of a student as an input, the program must display the name, marks obtained in the 5 subjects and the total. Write a program in Java to perform the task