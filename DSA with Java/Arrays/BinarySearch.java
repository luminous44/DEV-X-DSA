public class BinarySearch{

    public static int findIndex(int[] arr, int key){
       int start = 0;
        int end = arr.length - 1;
         while(start<end){
            int mid = start + ((end - start) / 2);
            if(arr[mid] == key){
                return mid+1;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,3,4,5,6,9,10,11};
        int key = 3;
    
       System.out.println("Key's index is :" +  findIndex(arr,key));


    }
}