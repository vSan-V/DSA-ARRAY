//MOVE ALL THE ZERO AT THE END OF THE ARRAY

import java.util.*;

class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3};
        ArrayList<Integer> list = new ArrayList<Integer>();
        BruteForce obj1 = new BruteForce();
        // obj1.zeroToEnd(arr, list);
        Optimal obj2 = new Optimal();
        obj2.moveZero(arr);
        
    }
}

//TC-O(2N) SC- O(N)
class BruteForce{
    public void zeroToEnd(int[] arr, ArrayList<Integer> list){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                
            list.add(arr[i]);
             
            }
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
        int tempSize = list.size();
        
        for(int i=tempSize;i<arr.length;i++){
            arr[i]=0;
        } 
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
}

//TC-O(N) SC-O(1)
class Optimal{
    public void moveZero(int[] arr){
        int j=-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



