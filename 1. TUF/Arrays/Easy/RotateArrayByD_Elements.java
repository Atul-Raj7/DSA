// LC - 189

public class RotateArrayByD_Elements {
    // Optimal Approach
    /*
        reverse(a,a+d)   = O(d)
        reverse(a+d,a+n) = O(n + d)
        reverse(a,a6n)   = O(n)
        Final TC = O(2n)
        SC = O(1)
    */
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
    static void reverse(int arr[], int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        
        rotate(arr,3);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}



// BruteForce Method
/*
 class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = nums[nums.length - k + i];
        }
        for(int i = nums.length - k - 1; i >= 0; i--){
            nums[i + k] = nums[i];
        }
        for(int j = 0; j < k; j++){
            nums[j] = temp[j];
        }
    }
}

// TC = O(n - k)
// Extra SC = O(n)
 */


