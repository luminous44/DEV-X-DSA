public class LeftRotationByDPlace {
    private static void reverse(int[] arr, int start, int end){
        int temp =0;
       while(start<end){
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
       }

    }
  public static void printArray(int[] arr){
     
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        
         int arr[] = {1,2,3,4,5,6,7};
         int r = 3;
         reverse(arr, 0, arr.length-1);
         reverse(arr, 0, r-1);
         reverse(arr, r, arr.length-1);
         printArray(arr);

        
    }
}
