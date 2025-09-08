package Array.Easy;

public class LargestEementInArray {
  

    private static int largestElement(int[] arr){
        
        int max = Integer.MIN_VALUE;

        for(int val : arr){
            
            max = Math.max(val, max);
        }

        return max;

    }
    public static void main(String[] args) {
        
      int arr[] = {2,20,22,40,50,99,44,30};
      System.out.println("largest element is : "+largestElement(arr));

    }
}
    
