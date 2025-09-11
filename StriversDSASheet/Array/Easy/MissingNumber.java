public class MissingNumber {

    public static void main(String[] args) {
        
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int x = 0;
        for(int i =1; i<=arr.length; i++){
            x = x^i;
        }
        for(int val : arr){
            x = x^val;
        }

        System.out.println("missing number is : "+x);

    }
    
}
