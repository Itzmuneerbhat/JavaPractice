import java.util.*;
public class TwoDArray {
   

    public static void main(String[]args){
  
         Scanner sc = new Scanner(System.in);

        System.out.println(" Enter number of rows ");
         int rows = sc.nextInt();
         System.out.println(" Enter number of cols");
         int cols = sc.nextInt();

int numbers[][] = new int [rows][cols];

   for(int i = 0; i<rows; i++){

   for( int j = 0; j<cols; j++){

    numbers [i][j] = sc.nextInt();
   }

   }

   for (int i=0; i<rows; i++){
    
    for( int j=0; j<cols; j++){

        System.out.println(numbers[i][j] + " ");
    }
    System.out.println();

   }


    }
    
}

    

