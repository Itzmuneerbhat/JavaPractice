// function overloading using parameters
public class overloading {

    // function to calculate sum of numbers
    public static int sum(int a , int b ){
        return a+b;
    }
    // function to calc sum of three numbers
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        System.out.println(sum(5,4));
        System.out.println(sum(5,3,1));

    }
}
