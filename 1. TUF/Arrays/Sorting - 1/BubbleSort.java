public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {42, 87, 13, 29, 64, 91, 5, 76, 33, 50};
        
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
