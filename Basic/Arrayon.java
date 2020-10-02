 import java.util.*;
public class Arrayon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total size");
        int s=sc.nextInt();
        sc.nextLine();
        String name[]=new String[s];
        
        int roll[]=new int[s];
      
        double marks[]=new double[s];
    
        for(int i=0;i<s;i++)
        {
            System.out.println("Enter Name");
            name[i]=sc.next();
            
            System.out.println("Enter Roll Number");
            roll[i]=sc.nextInt();
            
            System.out.println("Enter the Marks");
            marks[i]=sc.nextDouble();
            
            System.out.println();
        }
        
        for(int i=0;i<s;i++)
        {
              
            System.out.println((i+1)+" "+name[i]+"\t"+roll[i]+"\t"+marks[i]);
            
         
        }
    }
}
