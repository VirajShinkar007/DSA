public class Pattern {

    //simple star pattern
//  public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=4;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//  }

//inverted star patten
// public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print("*");
//         }
//         System.out.println("");
//     }


// }

//hybrid pyramid pattern
// public static void main(String[] args) {
//     int n=4;
//     // int counter=1;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j);
//         }
  
//         System.out.println("");
      
//     }
// }


// public static void main(String[] args) {
//     int n=4;
//     char ch='A';
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(ch);
//             ch++;
//         }
//         System.out.println("");
//     }
// }

//new pattern

// public static void main(String[] args) {
    
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int spaces=1;spaces<=n-i;spaces++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }


//hollow rectangle 
// public static void hollowrectangle(int totalrows,int totalcolumns){
//     for(int i=1;i<=totalrows;i++){
//         for(int j=1;j<=totalcolumns;j++){
//             if(i==1 || i==totalrows || j==1 || j==totalcolumns){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
           
//         }
//         System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     hollowrectangle(4,5 );
// }

// public static void invertedrotedhalfpyramid(int n){
//     for(int i=1;i<n;i++){
//         for(int j=1;j<n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     invertedrotedhalfpyramid(7);
    
// }


//inverted half pyramid with number
// public static void halfpyramidwithnu(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print(j+" ");
//         }  
//          System.out.println();   
//         }   
//     }
// public static void main(String[] args) {
//     halfpyramidwithnu(5);

    
// }

//floyds triangle
// public static void floydstriangle(int n){
//     int counter=1;
//     for(int i=0;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(counter);
//             counter++;
//         }
//        for(int j=1;j<=n-i;j++){
//                     System.out.print("");

//        }
//       System.out.println();

//     }
   
// }
// public static void main(String[] args) {
//     floydstriangle(5);
// }

//o 1 traingle
// public static void zeroonetriangl(int n){
//     for(int i=1;i<n;i++){
//         for(int j=1;j<=i;j++){
//             if((i+j)%2==0){
//                 System.out.print("1");
//             }else{
//             System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     zeroonetriangl(5);
// }

//butterfly pattern important
// public static void butterfly(int n){
//     for(int i=1;i<=n;i++){
//         //first star
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         //spaces
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         //second star
//            for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//              System.out.println();
//     }

//     //2nd half
//         for(int i=n;i>=1;i--){
//         //first star
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         //spaces
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         //second star
//            for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//              System.out.println();
//     }
   

// }
// public static void main(String[] args) {
//     butterfly(4);
    
// }

//solid rhombus
// public static void solidrhombus(int n){
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//         System.out.print("*");
//     }
//     System.out.println();  
// }


// }
// public static void main(String[] args) {
//     solidrhombus(5);
// }

//hollow rhombus
// public static void hollowrhombus(int n){
//     for(int i=1;i<=n;i++){
//      //spaces
//      for(int j=1;j<=(n-i);j++){
//         System.out.print(" ");
//      }

//      //hollow rectangle star
//      for(int j=1;j<=n;j++){
//         if(i==1 || j==1 || i==n || j==n){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//      }
//      System.out.println();
//     }

// }
// public static void main(String[] args) {
//     hollowrhombus(5);
// }

//diamond pattern
// public static void diamond(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
    
//         }
//         System.out.println();
//     }
//         for(int i=n;i>=1;i--){
//         for(int j=1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i)-1;j++){
//             System.out.print("*");
    
//         }
//         System.out.println();
//     }
    

// }
// public static void main(String[] args) {
//     diamond(4);
// }


 }
