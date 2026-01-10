public class Array {

    //binary 
    public static int binarysearch(int array[],int key){
        int start=0;
        int end = array.length-1;

        while (start<=end) {
            int mid= (start+end)/2;
            if (array[mid]==key) {
                return mid;
                
            }
            if (array[mid]<key) {
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
          
        }
        return -1;
       
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14};
        int key=8;

         int result =binarysearch(array, key);
         if (result== -1) {
            System.out.println("key not found ");
            
         }else{
            System.out.println("key found at "+ result);
         }
    }
    
}
