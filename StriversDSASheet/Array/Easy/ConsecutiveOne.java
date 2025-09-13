public class ConsecutiveOne {
    
    public static void main(String[] args) {

        int arr[] = {1,1,0,1,1,1};
        
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int val : arr){
            if(val == 1){
                count +=1;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }

        System.out.println("Maximum consecutive one is : "+max);

    }
}
