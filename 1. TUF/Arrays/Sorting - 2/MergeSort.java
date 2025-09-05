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

/* 
//                  Merge sort using  arraylist

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    
    void mergesort(List<Integer> list, int low, int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(list.get(left) <= list.get(right)){
                temp.add(list.get(left));
                left++;
            }
            else{
                temp.add(list.get(right));
                right++;
            }
        }

        while(left <= mid){
            temp.add(list.get(left));
            left++;
        }

        while(right <= high){
            temp.add(list.get(right));
            right++;
        }

        for(int i = 0; i < temp.size(); i++){
            list.set(i + low, temp.get(i));
        }
    }

    void ms(List<Integer> list, int low, int high){
        if(low >= high) return;

        int mid = (low + high) / 2;
        int right = mid + 1;
        ms( list, low, mid); 
        ms( list, right, high); 
        mergesort( list, low, mid,high);
    }
    
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(42, 87, 13, 29, 64, 91, 5, 76, 33, 50));

        Practice obj = new Practice();
        obj.ms(list, 0, list.size() - 1);
        System.out.println(list);
    }
}
*/

/*
 * 04.02.2025 ✔️
 */