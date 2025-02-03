import java.util.*;
public class basics {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         System.out.println("enter A");
         int a = sc.nextInt();

         
     System.out.println("enter B");
     int b = sc.nextInt();

        System.out.println("enter C");
        int c = sc.nextInt(); 
         
        if ((a>=b)&&(a>=c)) {
            System.out.println("A is the greater of the three" +a);
            
        }
         
        else if(b>=c){
            System.out.println(" B is the greater of the three" + b);

        }
        else{
             System.out.println("C is the greater of the three \n" +c);

          }
         
        
    }
    
}
