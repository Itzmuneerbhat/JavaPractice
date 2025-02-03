import java.util.*;
public class taxCalculator {
    public static void main(String[] args) {
        System.out.println("enter your income");
        Scanner sc = new Scanner (System.in);
        float income = sc.nextFloat();
        float tax;
        if (income<=500000) {
           tax = 0;
            
        }
        else if(income >=500000 && income < 1000000){
          tax = (float) (income* 0.18);
        }
        else{
           tax = (float) (income * 0.30);
        }
        System.out.println("your tax is "+ tax);
    }
    
}
