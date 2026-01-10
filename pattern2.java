public class pattern2 {
    // public static void main(String[] args) {
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         } 
    //          System.out.println();
    //     }
      
    // }


    //     public static void main(String[] args) {
    //     int n=5;
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         } 
    //          System.out.println();
    //     }
      
    // }

    // public static void pyramid(int n){
    //     for(int i=1;i<=n;i++){
    //         //spaces
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //    for (int j = 1; j <= 2 * i - 1; j++) {
    //         System.out.print("*");
    //     }
    //        System.out.println();
    //     }
     

    // }
    // public static void main(String[] args) {
    //     pyramid(4);
        
    // }

//cross pattern program
//     public static void crossprogram(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==j || i+j==n+1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
         
//             }
//                    System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         crossprogram(9);
//     }


//m pattern
 public static void mpattern(int n){
    for(int i=1;i<=3;i++){
        for(int j=1;j<=n;j++){
            if((i+j)%4==0 || i==2 && j%4==0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

 }
public static void main(String[] args) {
    mpattern(9);
}

}


