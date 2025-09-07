public class TrappingRainWater {
    
    private static int findWaterVol(int height[]){
        int n = height.length;
        // find left max boundaries
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            
            leftMax [i] = Math.max(leftMax[i-1], height[i]);
            
        }

        //  for(int num : leftMax ){
        //        System.out.print(num+" ");
        //  }
          // find Right max boundaries
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            
            rightMax [i] = Math.max(rightMax[i+1], height[i]);
            
        }
        // System.out.println();
        //  for(int num : rightMax ){
        //        System.out.print(num+" ");
        //  }
       
     int tw =0;
     int width = 1;
     for(int i =0; i<n; i++){
        // finding water level
        int wt = Math.min(leftMax[i], rightMax[i]);
        // find total trapped water 
        tw += wt - height[i] * width;
     }

        return tw;

    }
    private static int trappedWater(int arr[]){
        int l = 0;
        int r = arr.length -1;
        int lMax =0;
        int rMax =0;
        int tp =0;

        while(l<r){
          if(arr[l]<= arr[r]){
              if(lMax>arr[l]){
                tp += lMax - arr[l];
            }else{
                lMax = arr[l];
            }
            l++;
          }else{
              if(rMax>arr[r]){
                tp += rMax - arr[r];
            }else{
                rMax = arr[r];
            }
            r--;
          }
        }

        return tp;

    }
    public static void main(String[] args) {

       int arr[] = {4,2,0,6,3,2,5};  
       System.out.println("Trapped Water :"+trappedWater(arr));
       System.out.println("total trapped water : "+ findWaterVol(arr)); // tc = 0(n) && sc = 0(n)
       

       


    }
}
