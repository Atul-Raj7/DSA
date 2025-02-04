public class LinearSearch {
    /*
        TC = O(N)
        SC = O(1)
     */
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int a = 5;
       System.out.println(searchInSorted(arr, a)); 
    }
}

/*
 * 04.02.2025 ✔️
 */