// is array is sorted in ascending order
public class ArrayIsSorted {

    private static boolean isSorted(int[] arr){
        
        for(int i= 1; i< arr.length; i++ ){
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;

    }
     public static void main(String[] args) {
        
      int arr[] = {2,1,3,4,5,};
      System.out.println("Array is sorted? : "+isSorted(arr));

    }
}
