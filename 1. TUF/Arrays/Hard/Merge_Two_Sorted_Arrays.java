// Lc - 88

import java.util.Arrays;
public class Merge_Two_Sorted_Arrays{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,0,0,0,0,0,0,0};
        int[] arr2 = {2,4,5,6,7,8,9};
        int m = arr1.length - arr2.length;
        int n = arr2.length;
        
        merge(arr1, m, arr2, n);
        System.err.println(Arrays.toString(arr1));
    }
}