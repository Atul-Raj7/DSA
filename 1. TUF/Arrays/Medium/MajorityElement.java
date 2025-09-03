// LC - 169

import java.util.*;
public class MajorityElement {

    // Moore's Voting Algorithm
    // TC = O(n)
    // TC = O(1)




    // TC = O(N log N)
    // SC = O(N)
   
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int limit = n / 2;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > limit){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,2,2,0,0,2,2};
        System.out.println(majorityElement(arr));
    }
}