import java.util.Scanner;

public class condition {
    
    // public static void main(String[] args) {
    //     int age=18;
    //     if(age>=18){
    //         System.out.println("you can vote");
    //     }
    //     else if(age>13 && age<18){
    //         System.out.println("you are teenager");
    //     }
    //     else{
    //         System.out.println("you cant vote");
    //     }

        

    // }

    //largest of two
    // public static void main(String[] args) {
    //     int a=30;
    //     int b=40;
    //     if(a>=b){
    //         System.out.println("a is largest two");
    //     }
    //     else{
    //         System.out.println("b is largest two");
    //     }
   
    // }
    
    //even odd
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     if(num%2==0){
    //         System.out.println("even number");
    //     }
    //     else{
    //         System.out.println("odd number");
    //     }
    // }

    //income tax calc
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int income = sc.nextInt();

      if(income<=500000){
        System.out.println("no tax ");

      }
      else if(income>500000 && income <= 1000000){
        int tax = (int)(income*0.02);
        System.out.println("tax is " + tax);

      }
     else{
        int tax = (int)(income*0.03);
        System.out.println("tax is " + tax);
      }
    }
}
