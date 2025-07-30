import java.util.*;
class Intersection{
    public static void main(String[] args){
        int[] arr1 = {5,5,5,5};
        int[] arr2 = {5,5,5,5};
        ArrayList<Integer> list = new ArrayList<Integer>();
        BruteForce obj1 = new BruteForce();
        obj1.intersection(arr1, arr2, list);
        
        Optimal obj2=new Optimal();
        obj2.interSection(arr1, arr2, list);
        
    }
}

//Brute Force Aproach 
//TC- O(N1*N2) SC- O(N2)
class BruteForce{
    public void intersection(int[] arr1, int[] arr2, ArrayList<Integer> list) {
        int[] temp = new int[arr2.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if((arr1[i]==arr2[j]) && temp[j]==0){
                    list.add(arr1[i]);
                    temp[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]) break;
            }
        }
        System.out.println(list);
    }
}
class Optimal{
    public void interSection(int[] arr1, int[] arr2, ArrayList<Integer> list)
    {
        int a= arr1.length;
        int b = arr2.length;
        int i=0;
        int j=0;
      while (i < arr1.length && j < arr2.length) {
    if (arr1[i] == arr2[j]) {

        if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
            list.add(arr1[i]);
        }
        i++;
        j++;
    } else if (arr1[i] < arr2[j]) {
        i++;
    } else {
        j++;
    }
}
}
}


