import java.util.*;


public class FunctionFactorial {

    public static void PrintFactorial(int n){
        //loop 
        if (n<0){
            System.out.println(" number is invalid ");
            return;
        }
        int factorial = 1;
        for (int i=n; i>=1; i--){

            factorial = factorial*i;
        }
        System.out.println(factorial); 
        return;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
          int n = sc.nextInt();
          PrintFactorial(n);

    }
    
}
