import java.util.*;
public class Switch {
    public static void main(String[] args) {
        System.out.println(" enter number");

         Scanner sc = new Scanner(System.in);
             int Button = sc.nextInt();

             switch (Button) {
                case 1: System.out.println("hello");
                    
                      break;
             
                case 2: System.out.println(" aslamu alikum");
                    break;

                    case 3: System.out.println("namaste");
                    break;

                    default: System.out.println(" invalid");
             }
    }
}
