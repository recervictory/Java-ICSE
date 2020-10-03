import java.util.*;
import java.lang.*;
// store the factors of a number  in a array
class FactorsArray {
    public static int[] factors(int number){ //number =15
        int factor_size = 0;
        for(int i=1;i <= number; i++){
            if(number%i == 0){
                factor_size++;
            }
        }
        // factor_size = 4

        int[] factors_array = new int[factor_size];
        int index = 0;
        for(int i=1;i <= number; i++){
            if(number%i == 0){
                factors_array[index]= i;
                index++;
            }
        }
        return factors_array;
    }
    
    public static boolean isPrime(int num){
        boolean flag = true;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for prime number
            if(num % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static int[] primefactors(int[] factors) {
        List<Integer> primelist=new ArrayList<Integer>();  
        for(int i=0; i < factors.length ; i++){
            if(isPrime(factors[i])){
                primelist.add(factors[i]);
            }
        }
        int[] primeArray = new int[primelist.size()];
        for (int i = 0; i < primeArray.length; i++) {
                primeArray[i] = primelist.get(i);
        }
        return primeArray;
    }
    
    public static void display_array (int[] factors_array){
        for (int i=0; i < factors_array.length ; i++){
            System.out.print(factors_array[i]+" ");
        }
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = in.nextInt();
        int[] factors_array = factors(n);
        System.out.println("Factors length :"+factors_array.length);
        
        display_array(factors_array);
    }
}
