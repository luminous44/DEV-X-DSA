import java.util.HashSet;

public class ContainsDuplicate {

private static boolean isContain(int arr[]){

    
        HashSet<Integer> set = new HashSet<>();

        for(int val : arr ){
            if(set.contains(val)){
                return true;
            }
            set.add(val);
        }

    return false;
}


    public static void main(String[] args) {

        int arr[] = {4,2,1,3,5};

        System.out.println(isContain(arr));
        

    }
    
}
