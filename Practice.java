import java.util.HashMap;

public class Practice {

    static int longestSum(int a[], int k){
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            //check if the element at first or after summing it up, equals to k or not
            sum += a[i];
            // if yes, then update the maxLen
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1); // i + 1 is b/c i is starting from 0
            }

            //now, we have the the sum, in order to calculate the length we'll subtract it from k
            int rem = sum - k;
            //then we'll check what is the longest length of the subarray in map which can be called Reverse Engneering(Keeping count of the summation and its location so it's easy to find the longest sub array) 


            //⚠️⚠️ in the map we'll put summation of subarray in place of it's <key> and array's index in <value>⚠️⚠️
            // I still need to find why i is getting subtracted with preSumMap.get(rem)
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // update the map with new summations
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int arr[] = {5,5,4,9,2,2,2,2,1,1};
        int k = 10;
        System.out.println(longestSum(arr, k));
    }
}