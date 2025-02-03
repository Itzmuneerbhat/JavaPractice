import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        double num1 = sc.nextDouble();


           System.out.println(" Enter an operator (+,_,*,/):");
              char operator = sc.next().charAt(0);
              
              
                System.out.println("Enter num2");
                 double num2 = sc.nextDouble();
                   double result = 0;

        /*switch (operator) {
            case '+' : result = num1 + num2 ;
                break;
        
            case '-' : result = num1 - num2 ;
                break;

            case '*' : result = num1 - num2 ;  
                 break;
                 
            case '/' : if (num2 !=0) {
                       result = num1 / num2 ;
            }     
             else {
                    System.out.println("Error ! Division by zero is not allowed.");
                    return;

             } break;

             default :
             System.out.println("Error ! Invalid operator.");
             return;
        }
        System.out.println("the result is : " + result);
    }
}
     */
     switch (operator) {
        case '+' : System.out.println(num1 + num2);
            
            break;
     
        case '-' : System.out.println(num1 - num2);
            break;

        case '*' : System.out.println(num1 *  num2);   
             break ;

        case '/' : System.out.println(num1 / num2);
             break ;     
            default : System.out.println("invalid");
     }
    }
}
