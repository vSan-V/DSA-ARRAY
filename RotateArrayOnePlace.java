import java.util.*;

class RotateArrayOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Optimal obj1= new Optimal();
        obj1.rotateByOne(arr);
        
    }
    
}
//Optimal Solution
//TC- O(N) SC - O(1);
class Optimal{
    public void rotateByOne(int[] arr){
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1]= arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}