// LC - 27

public class Remove_element {
    static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j]; 
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args){
        int[] arr =  {3,2,2,3};
        int val = 2;
        System.out.println(removeElement(arr, val));   
    }
}
