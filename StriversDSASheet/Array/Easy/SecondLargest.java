//Second Largest Element in an Array without sorting
public class SecondLargest {
     private static int SecondLargestElement(int[] arr){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i =1; i<arr.length; i++)
            if(arr[i] != largest){ // // if it contain duplicate largest number
                if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i] ;   
               }else{
                if(arr[i]> secLargest){
                    secLargest = arr[i];
                }
             }
            } 
            
        return  secLargest;
        
        }

      
     public static void main(String[] args) {
        
      int arr[] = {2,20,50,22,100,40,50,65,99,44,30};
      System.out.println("Second element is : "+SecondLargestElement(arr));

    }
}
