public class MoveZeroToTheEnd {

    private static void moveZero(int[] arr){ // with change original order of number's

        int l =0;
        int r = arr.length -1;
        while (l<r) {

         if(arr[r] == 0){
            r--;
         }else if(arr[l] == 0){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;r--;
         }else{
            l++;
         }     
        }

    }
     public static void printArray(int[] arr){
     
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    private static void moveZeros(int arr[]){

        int j =-1 ;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==0){
                j = i;
                break;
            }
        }
        for(int i =j+1; i<arr.length; i++){
                if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    } // with out changing order of the number
    public static void main(String[] args) {
        
        int arr[] = {1,0,1,3,0,0,0,2,3,0,0,0,1,1,1,3,0};
         int arr1[] = {1,0,1,3,0,0,0,2,3,0,0,0,1,1,1,3,0};
        printArray(arr);
          System.out.println("with changing number order");
       // moveZero(arr);
        System.out.println("with out changing number order");
        moveZeros(arr);
        printArray(arr);

    }
    
}