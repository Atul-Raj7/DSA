public class RecursiveInsertionSort {
    
    void InsertionSort(int[] arr, int j, int n){
        if(j == n) return;

        int temp;
        for(int i = j; i > 0; i--){
            if(arr[i] < arr[i - 1]){           
            temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            }
        }
        InsertionSort(arr, j + 1, n);
    }
    
    public static void main(String[] args){
        int[] arr ={92, 3, 20, 41, 26, 53, 84, 25, 24, 8};
        RecursiveInsertionSort obj = new RecursiveInsertionSort();
        obj.InsertionSort(arr, 1, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
