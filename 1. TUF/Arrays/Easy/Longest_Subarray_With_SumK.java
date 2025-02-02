import java.util.HashMap;

public class Longest_Subarray_With_SumK {
    //Better
    // TC = O(n*logn)
    // SC = O(n)
    // Best for Positive + Negative numbers
    static int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            
            int rem = sum - k;
            
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = longestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
