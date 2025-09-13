public class NumberAppersOnce {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,5};
        int x = 0;
         for(int val : arr){
            x = x^val;
        }
        System.out.println("missing number is : "+x);
    }
}
