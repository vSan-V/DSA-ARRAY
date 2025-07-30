//Check if array sorted or not
class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,6,3,4};
        int result = sorted(arr);
        
        if(result == 0){
            System.out.println("array is sorted");
        }
        else{
           System.out.println("array is not sorted");
        }
    }
    static int sorted(int[] arr){
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return -1;
            }
          
        }
          return 0;
    }
}