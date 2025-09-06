import java.lang.reflect.Array;

public class MaxSubArraySum {

    private static void prefixMaxSum(int[] arr){
        // using prefix sum

         int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        //  for(int num : prefix ){
        //        System.out.print(num+" ");
        //  }
        int currSum =0;
        for(int j =0; j<prefix.length; j++){
            int start = j;
            for(int k = j; k<prefix.length; k++){
             int end = k;
               
             currSum = start==0 ? prefix[end] : prefix [end]- prefix[start-1];
             if (currSum>max) {
                max = currSum;
                
             }

            }
        }

        System.out.println("Maximum sub array sum is : "+max);


    }

    private static void kadansMaxSum(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int val : arr){
            currSum = currSum + val;
            if(currSum<0){
                currSum =0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max sum : "+maxSum);
 
    }

    public static void main(String[] args) {
        int arr[] = {2,-1,6,10,-3,7};
        prefixMaxSum(arr);
        kadansMaxSum(arr);

    }
    
}
