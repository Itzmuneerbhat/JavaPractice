public class floydsTriangle {


    public static void floyds_triangle(int n){
      
        // outer loop
        int  counter = 1;
        for(int i = 1 ; i<=n ; i++ ){

            // inner loop how many times counter will be printed
            for(int j =1 ; j<=i; j++){

                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        floyds_triangle(8);
        
    }
    
}