//Remove Duplicates in Sorted Array
import java.util.*;
class RemoveDuplicateSorted {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,4,4};
       BrutteForce obj1 = new BrutteForce();
       //obj1.removeDuplicate(arr);
       Optimal obj2 = new Optimal();
       obj2.removeDuplicate(arr);
    }
}
//Remove Duplicates using Hashset. Bcoz it does not allowed deplicates
class BrutteForce{
    public void removeDuplicate(int[] arr){
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int i = 0;i<arr.length;i++){
            set1.add(arr[i]);
        }

        System.out.println(set1);
         
         int i = 0;
         for(int num:set1){
             arr[i]=num;
             i++;
         }
         for(int j=0;j<i;j++){
             System.out.print(arr[j]);
         }
         System.out.println();
        
    }
}

class Optimal{
    public void removeDuplicate(int[] arr){
        int i=0;
        int count = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
                count++;
            }
            
        }
        for(i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


