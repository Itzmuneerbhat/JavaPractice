import java.util.*;
public class FunctionProduct {

    public static int CalculateProduct(int a , int b){
        
      return a * b ; 
    }

    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number");
int a = sc.nextInt();
System.out.println(" enter 2nd number ");
int b = sc.nextInt();


System.out.println("Product of two numbers is:" + CalculateProduct(a,b));

    }
}
 