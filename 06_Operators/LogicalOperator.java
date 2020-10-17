import java.util.*;
public class LogicalOperator
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("What is the name of you country: \n1.India\n2.Bharat");
            int ans = in.nextInt();
        if ( ans != 2 ){
         System.out.println("correct");
    } else {
        System.out.println("incorrect");
    }
}
}
