import java.util.*;
public class ModulusOperator
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        
        int mod = num1%num2;
        System.out.println("Mod : "+mod);
        
        if (mod == 0) {
            System.out.println(num1+" is divisable by "+ num2);
        }
        else {
            System.out.println(num1+" is not divisable by "+ num2);
        }
    }
}
