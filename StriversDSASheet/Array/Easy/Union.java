import java.util.ArrayList;

public class Union {
    
    private static ArrayList<Integer> findUnion(int a[], int b[]){
        
        ArrayList<Integer> rList = new ArrayList<>();

         int i =0, j=0; 
         while(i<a.length && j<b.length){  
            if(a[i] < b[j]){
                if(rList.size() == 0 || rList.get(rList.size()-1) != a[i]){
                     rList.add(a[i]);
                    
                }
                 i++;
            }else if(b[j]<a[i]){
                if(rList.size() == 0 || rList.get(rList.size()-1) != b[j]){
                     rList.add(b[j]);
                    
                }
                 j++;
            }else{
                 if(rList.size() == 0 || rList.get(rList.size()-1) != b[j]){
                     rList.add(b[j]);
                    
                }
                 i++;
                 j++;
            }
         }
         while (i<a.length) {
              if(rList.get(rList.size()-1) != a[i]){
                     rList.add(a[i]);
                   
                }
                  i++;
         }
         while (j<b.length) {
               if(rList.get(rList.size()-1) != b[j]){
                     rList.add(b[j]);
                  
                }
                   j++;
         }

        return rList;
    }
    public static void main(String[] args) {
        
        int a[] = {1,2,3,3,4,6};
        int b[] = {3,4,6,7,8};

       ArrayList<Integer> List = findUnion(a,b);
       System.out.println(List);
    }
}
