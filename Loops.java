import java.util.Scanner;

public class Loops {


    //while loop
    // public static void main(String[] args) {
    //     int number=0;
    //     while(number<100){
    //         System.out.println("hello world");
    //         number++;

    //     }

    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int sum=0;
    //     int i =1;

    //     while(i<=n){
    //         sum=sum+i;
    //         i++;
    //     }
    //     System.out.println(sum);
    // }


    //for loop
    // public static void main(String[] args) {
    //     int line =1;
    //     for(int i=1;i<=4;i++){
    //         System.out.println("****");
    //         line++;
    //     }
        
    // }

    //print revers of the no
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     while(n>0){
    //         int lastdigit=n%10;
    //         System.out.print("" + lastdigit);
    //         n=n/10;
    //     }
    //     System.out.println("");
   
    // }

    //reverse 
    // public static void main(String[] args) {
    //     int n= 666778;
    //     int rev=0;
    //     while(n>0){
    //         int lastdigit=n%10;
    //         rev=(rev*10)+lastdigit;
    //         n=n/10;
    //     }
        
    // System.out.println(rev);
    // }

    //do while loop

    //enter the no while user enter the multiple of 10
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     do{
    //         System.out.println("enter your no");
    //         int n=sc.nextInt();
    //         if(n%10==0){
    //             break;
    //         }
    //         System.out.println(n);
    //     }
    //     while(true);

    // }

    //continue keyword
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//        if(i==3){
//         continue;
//        }
//        System.out.println(i);
       
//     }
// }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean isPrime=true;
    for(int i=2;i<n-1;i++){
        if(n%2==0){
            isPrime=false;
            break;
        }
        if(isPrime==false){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");    
        }
    }
}
}
