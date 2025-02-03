import java.util.*;
public class elseIf {
    
    public static void main(String[]args){
    System.out.println("enter your age");
     Scanner sc = new Scanner (System.in);
     int age = sc.nextInt();
     if (age >= 18) {
        System.out.println("you are adult"); 
     }
     else if(age >= 13&& age <18){
        System.out.println(" you are teenager");
     }
}
}