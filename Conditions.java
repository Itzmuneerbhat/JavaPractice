import java.util.*;
public class Conditions{
    public static void main(String[] args) {

        System.out.println("enter your age ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=18) { 
            System.out.println("You are adult");
            
            
        }
        else{
            System.out.println(" You are minor");
        }

        
    }




}