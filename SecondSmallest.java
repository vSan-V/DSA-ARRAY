//Find the Second larges Element in the array
import java.util.*;

class Main {
    public static void main(String[] args) {
     int[] arr ={1,2,3,4};
     int result =  secondSmallest(arr);
     System.out.println(result);
     
    }
    static int secondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(secondSmallest > arr[i]&& arr[i]!=smallest){
                secondSmallest = arr[i];
            }
            
        }
        return secondSmallest;
    }
}






