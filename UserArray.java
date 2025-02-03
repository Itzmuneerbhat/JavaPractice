import java.util.*;
 public class UserArray {
     public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

           System.out.println(" enter array size");

              int size = sc.nextInt();

                 int numbers[] = new int [size];

               System.out.println(" enter your numbers");

            for(int i=0; i<size; i++){
   
           numbers[i] = sc.nextInt(); 
}
        System.out.println("find your x");

           int x = sc.nextInt();

             for(int i=0 ; i<numbers.length; i++){

               if(numbers[i]==x){

                  System.out.println("x is found at index:" + i);
    }

   
}

    }
    
}
