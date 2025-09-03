// LC - 26

public class Remove_Duplicate_from_Sorted_Array {
    static int removeDuplicates(int[] nums) {
        int i = 0;
            for(int j = 1; j < nums.length; j++){
                if(nums[j] != nums[i]){
                    nums[i + 1] = nums[j];
                    i++;
                }
            }
        return i + 1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5,6,7,8,9,10};
        System.out.println(removeDuplicates(arr));
    }
}

