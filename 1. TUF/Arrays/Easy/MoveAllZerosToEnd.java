public class MoveAllZerosToEnd {
    /*
        TC = O(n)
        Sc = O(1)
     */
    static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
    
        while(i < nums.length && j < nums.length){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                }   
            j++;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,0,2,4,1};
        moveZeroes(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}





// Bruteforce 
/*
    class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }

        for(int i = 0; i < temp.size(); i++){
            nums[i] = temp.get(i);
        }

        int nonZero = temp.size();

        for(int i = nonZero; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

TC = O(2n)
SC = O(n)
 */