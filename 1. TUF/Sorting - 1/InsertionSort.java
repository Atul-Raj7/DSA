public class InsertionSort {
    public static void main(String[] args){

        int[] arr = {42, 87, 13, 29, 64, 91, 5, 76, 33, 50};
        int temp;
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
