//left shift
import java.util.*;
class RotateElementByKthPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        // BruteForce obj1 = new BruteForce();
        // obj1.rotateElement(arr, k);
        
        Optimal obj2 = new Optimal();
        obj2.leftShift(arr, 0, k-1);
        obj2.leftShift(arr, k, arr.length-1);
        obj2.leftShift(arr, 0, arr.length-1);

    }
}
class BruteForce{
    public void rotateElement(int[] arr, int k){
        int n = arr.length-k;
        int temp[]= new int[k];
        for(int i= 0;i<k;i++){
            temp[i]=arr[i];
        }
        
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=n;i<arr.length;i++){
            arr[i]=temp[i-n];
           // j++;
        }
        
    // System.out.println(Arrays.toString(temp));
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(arr));
    }
}
class Optimal{
    public static void leftShift(int[] arr, int start, int end){
       while(start<=end){
           int temp = arr[start];
           arr[start]= arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
    }
}





