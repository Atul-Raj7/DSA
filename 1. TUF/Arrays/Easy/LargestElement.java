public class LargestElement{

    static int large(int[] arr){
        int l = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > l){
                l = arr[i];
            }
        }
        return l;
    }
    public static void main(String[] args){
        int[] arr = {2,36,45,12,20,71};
        System.out.println(large(arr));
    }
}