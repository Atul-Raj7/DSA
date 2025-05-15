public class SortColors {

    // Dutch National Flag Problem
    // TC = O(n)
    // SC = O(1)

    static void sort(int[] arr){
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while(mid <= high){

            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

    }

    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}



/*  Bruteforce
    TC = O(2N)
    SC = O(0)
     
 class Solution {
    public void sortColors(int[] nums) {
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        // return nums;
    }
}
 */