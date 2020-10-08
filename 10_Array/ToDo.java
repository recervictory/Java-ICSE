import java.util.*;
/*
 Program : Implement Todo List with Array
 Author : Victor Banerjee
*/

public class ToDo {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of List");
        int size = in.nextInt();
        in.nextLine(); /// solve the line problem

        int pri[] = new int[size];
        String plan[] = new String[size];

        int l = pri.length;
        System.out.println("The length of array is " + l);

        System.out.println("Input: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a plan: ");
            plan[i] = in.nextLine();
            System.out.println("Enter a priority: ");
            pri[i] = in.nextInt();
            in.nextLine(); // resolve line problem
        }

        System.out.println("Output:");
        for (int i = 0; i < l; i++) {
            System.out.println((i + 1) + " " + plan[i] + "\t" + pri[i]);
        }
        in.close();
    }
}
