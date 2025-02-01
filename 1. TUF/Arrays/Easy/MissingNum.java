public class MissingNum {
     
    // Optimal
    // TC = O(n)
    // SC = O(1)
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int total  = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        return total - sum;
    }
    
    /* BETTER
        TC = O(n + n) = 2n
        SC = O(n)
     * public int missingNumber(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], 1);
        }
        for(int i = 0; i < nums.length + 1; i++){
            if(!map.containsKey(i)){
                answer = i;
            }
        }
        return answer;
    }
     */
    

    // Bruteforce
        // TC = O(n * n) or O(n^2)
        /*
         * static int missingNumber(int[] nums) {
            int ans = 0;
            int i = 0;
            while (i <= nums.length) {
            int flag = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == i) {
                        ans = i;
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    ans = i;
                    break;
                }
                i++;
            }
            return ans;
        
    }
         */
    public static void main(String[] args){
        int[] arr = {4,1,3,6,0,2};
        System.out.print(missingNumber(arr)); 
    }
}