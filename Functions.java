import java.util.Scanner;
import java.util.*;
public class Functions {
    // public static void printhello(){
    //     System.out.println("hellow world ");
    // }

    // public static int printsum(int a,int b){
    //     System.out.println(a+b);
    //     return 2;

    // }

    // public static void main(String[] args) {
    //     // printhello();
    //      Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     printsum(a,b);

    // }

    //product of two number
    // public static int product(int a,int b){
    //     return a*b;

    // }
    // public static void main(String[] args) {
    //     int a=5;
    //     int b=7;
    //     int sumis =product(a, b);
    //     System.out.println("the product is "+sumis);

    // }


    //factorial of number
    public static int factorial(int n){
       int fact=1;
       for(int i=1;i<=n;i++){
        fact=fact*i;
      
       }
       return fact; 
    }

    public static int bincoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_r=factorial(n-r);

        return fact_n/(fact_r*fact_n_r);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(bincoeff(5, 2));
        
    }
    
}
