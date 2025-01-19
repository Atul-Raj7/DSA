import java.util.*;
public class MergeSort{



    void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }



    void ms(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merge(arr,low,mid,high);
    }


    public static void main(String[] args){
        MergeSort obj = new MergeSort();
        int[] arr = {42, 87, 13, 29, 64, 91, 5, 76, 33, 50};
        obj.ms(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}