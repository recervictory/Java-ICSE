import java.util.*;
class AllMathLib
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        double n;
        System.out.println(" Enter a number ");
        n=sc.nextDouble();
        
        //to find the sqrt
        System.out.println(" The value of sqrt is = "+Math.sqrt(n));
        
        //to find the cbrt
        System.out.println(" The value of cbrt is = "+Math.cbrt(n));
        
        //to find the pow
        int p;
        System.out.println(" Enter the power");
        p=sc.nextInt();
        System.out.println(" The value of pow is = "+Math.pow(n,p));
        
        //to find the log
        System.out.println(" The value of log is = "+Math.log(n));
        
        //to find the abs
        System.out.println(" The value of abs is = "+Math.abs(n));
        
        //to find the round
        System.out.println(" The value of round is ="+Math.round(n));
        
        //to find the rint
        System.out.println(" The value of rint is ="+Math.rint(n));
        
        //to find the ceil
        System.out.println(" The value of ceil is ="+Math.ceil(n));
        
        //to find the floor
        System.out.println(" The value of floor is ="+Math.floor(n));
        
        //to find the random
        double i,k;
        System.out.println(" Enter two numbers ");
        k=sc.nextDouble();
        for (i=1;i<=k;i++)
        {
             n=Math.random()*k;
             System.out.println(" The value of random ="+n);
            }
    }
}