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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            System.out.print("" + lastdigit);
            n=n/10;
        }
        System.out.println("");
   
    }
}
