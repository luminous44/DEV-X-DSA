import java.util.ArrayList;

public class Intersection {

    public static  ArrayList<Integer>  findIntersection(int[]a, int[]b){

         ArrayList<Integer> list  = new ArrayList<>();
         
         int i =0, j=0;
         while(i<a.length && j<b.length){

            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                list.add(a[i]);
                i++;
                j++;
            }
         }

         return list;

    }

    public static void main(String[] args) {
         int a[] = {1,2,3,3,4,4,6};
         int b[] = {3,4,4,6,7,8};

         ArrayList<Integer> list = findIntersection(a,b);
         System.out.println(list);

    }
    
}
