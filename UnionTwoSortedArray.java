import java.util.*;
class UnionTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};
        HashSet<Integer> set = new HashSet<Integer>();
        
        BruteForce obj1 = new BruteForce();
        obj1.unionAll(arr1, arr2, set);
        
        Optimal obj2 = new Optimal();
        ArrayList<Integer> list = new ArrayList<Integer>();
        obj2.unionArray(arr1, arr2, list);
        
        
    }
}

//TC- O(N1LOGN)+O(N2LOGN)+O(N1+N2)
//SC- O(N1+N2) + O(N1+N2)
class BruteForce{
    public void unionAll(int[] arr1, int[] arr2, HashSet<Integer> set){
        for(int i=0;i<arr1.length;i++){
           set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int[] temp = new int[set.size()];
        int i=0;
        for(int value:set){
            temp[i] = value;
            i++;
        }
        
        
        System.out.println(Arrays.toString(temp));
    }
}

class Optimal{
    public void unionArray(int[] arr1, int[] arr2, ArrayList<Integer> list){
        int a = arr1.length;
        int b = arr2.length;
        int i=0;
        int j=0;
        while(i<a && j<b){
            if(arr1[i]<arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    i++;
                }
            }
            else if(arr2[j]<arr1[i]){
                 if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }
            }
            else{
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<a){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    i++;
                }
            }
        while(j<b){
            if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }
        }
        System.out.println(list);
        
    }
}