import java.util.*;
public class WhileLoop5
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k,i;
         System.out.println("Enter a number");
         k=sc.nextInt();
         i=0;
         while(i!=k)
         {
              
              System.out.println("The value of i ="+i);
              i+=1;
         }
    }
}