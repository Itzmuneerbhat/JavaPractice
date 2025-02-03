import java.util.*;
public class Natural {
    public static void main(String[] args) {
        System.out.println(" Enter any number ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int sum = 0;
        for(int i = 1; i<=number; i++){
         
        sum = sum + i;
    } 
    System.out.println(sum);
}
    
}
