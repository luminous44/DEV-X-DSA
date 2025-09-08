public class RemoveDuplicateSortedArr {

private static int index = 0;

    private static int removeDuplicate(int[] arr){
    

        for(int i = 1; i<arr.length; i++){
            if(arr[index] != arr[i] ){
                arr[index+1] = arr[i];
                index++;
            }
        }

      return index;
    }

    public static void printArray(int[] arr){
     
        for(int i=0; i<=index; i++){
         System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
           int arr[] = {1,2,3,3,4,5,5,5,6};
           removeDuplicate(arr);
           printArray(arr);


        

           
    }
}
