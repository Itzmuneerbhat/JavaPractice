public class inRange {
// function to check number is prime or not
    public static boolean isprime(int n){
        boolean isprime = true; 
         for(int i= 2 ; i<=n-1; i++) {
           if (n%i == 0) {
               isprime = false ;
               
           }
   
         }
              return isprime;
       }

    public static void primesInRange(int n){
        for(int i = 2; i<=n; i++){
          if(isprime(i)){ //true
              System.out.println(i+"");
            }
          
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
       primesInRange(20);
    }
    
}
