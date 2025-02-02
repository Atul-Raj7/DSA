public class SingleNumber {

    // Optimal
    // TC = O(N)
    // SC = O(1)
    static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }
    /* Bruteforce
    // TC = O(n^2)
    // SC = O(1)
    static int singleNumber(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == num){
                    count++;
                }
            }
            if(count == 1){
            return num;
            }
        }
        return -1;
    }
        */
    public static void main(String args[]){
        int[] arr = {2,2,1}; 
        System.out.println(singleNumber(arr));
    }
}