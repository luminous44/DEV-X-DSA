public class ReverseanArray {

    public static void main(String[] args) {
        
          int arr[] = {2,3,4,5,6,9,10,11};

         int start = 0;
         int end = arr.length - 1;
         int temp = -1;

         while(start<end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

         }
         for(int num : arr ){
               System.out.print(num+" ");
         }

    }
    
}
