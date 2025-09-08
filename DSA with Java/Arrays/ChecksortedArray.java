public class ChecksortedArray {


    private static boolean isSorted(int[] nums){

         for(int i =1; i<nums.length; i++){
             
             if(nums[i] < nums[i-1]){
                return false;
             }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums = {1,4,3,4,5};

        System.out.println("Is array Sorted : "+isSorted(nums));
        
        

    }

    
}
