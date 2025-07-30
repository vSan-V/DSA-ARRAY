import java.util.*;
class MissingNumber{
    public static void main(String[] args){
        int length =7;
        int[] arr= {1,2,3,4,5,7};
        
        BruteForce obj1 = new BruteForce();
        //obj1.missingNumber(arr,length);
        BetterSolution obj2 = new BetterSolution();
        //obj2.missingNumber(arr, length);
        Optimal1 obj3 = new Optimal1();
        //obj3.missingNumber(arr, length);
        
        Optimal2 obj4 = new Optimal2();
        obj4.missingNumber(arr, length);
       
    }
}
//Brute force
//TC-O(N*N) SC-0(n)
class BruteForce{
    public void missingNumber(int[] arr, int length){
        for(int i=1;i<=length;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }
}
//TC-O(2N) -> O(N) SC-0(N)
class BetterSolution{
    public void missingNumber(int[] arr, int length){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : arr){
            set.add(num);
        }
        
        for(int i=1;i<=length;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
//TC-O(N) SC-O(1);
class Optimal1{
    public void missingNumber(int[] arr, int length){
        int sum1 = length*(length+1)/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2 = sum2+arr[i];
        }
        int finalValue = sum1-sum2;
        System.out.println(finalValue);
    }
}
//We can find the missing number using XOR^. Means same value 0,  and 
//different value gives 1. If any one value left. it will return that value
class Optimal2{
    public void missingNumber(int[] arr, int length){
        int xor1= 0;
        for(int i= 1;i<=length;i++){
            xor1=xor1^i;
        }
        int xor2 = 0;
        for(int i=0;i<arr.length;i++){
            xor2= xor2^arr[i];
        }
        System.out.println(xor1^xor2);
    }
}

