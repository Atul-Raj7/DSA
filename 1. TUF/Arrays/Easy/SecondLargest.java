public class SecondLargest{

    static int secondl(int[] arr){
        int large = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > large) large = arr[i];
        }

        int second = -1;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] > second && arr[i] != large) second = arr[i];
        }
        return second;
    }
    public static void main(String[] args){
        int[] arr = {21,54,87,65,32,87};
        System.out.println(secondl(arr)); 
    }
} 
