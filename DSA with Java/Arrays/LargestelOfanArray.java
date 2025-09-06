public class LargestelOfanArray {

      private static int largestElement(int[] nums) {
     
     int max = Integer.MIN_VALUE;

     for(int val : nums){
        max = Math.max(max,val);
     }

     return max;

    }
    public static void main(String[] args) {
        
        int nums[] = {3, 3, 0, 99, -40}; 

        System.out.println("largest number is : "+largestElement(nums));
        
    }
}
