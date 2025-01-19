import java.util.Arrays;

public class RecursiveBubleSort {
    void bubblesort(int[] arr, int n){
        if(n == 1) return;

        int temp;

        for(int i = 0; i < n - 1; i ++){
            if(arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        n--;
        bubblesort(arr, n);
    }

    public static void main(String[] args) {
        RecursiveBubleSort obj = new RecursiveBubleSort();
        int[] arr = {7, 42, 1, 99, 13, 5, 28, 63, 10, 3};
        obj.bubblesort(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
