import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    static int partition(List<Integer> list, int low, int high){
        int pivot = list.get(low);
        int i = low;
        int j = high;

        while( i < j) {
            // taking smaller elements than pivot from left to right 
            while(list.get(i) <= pivot && i <= high - 1) i++;
            // taking bigger elements than pivot from right to left 
            while(list.get(j) > pivot && j >= low + 1) j--;

            int temp;
            if(i < j){
                temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(j);
        list.set(j, list.get(low));
        list.set(low, temp); 

        return j;
    }

    static void quicksort(List<Integer> list, int low, int high){
        if(low >= high) return;

        int partition = partition(list, low, high);

        quicksort(list, low, partition - 1);
        quicksort(list, partition + 1, high);
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(42, 87, 13, 29, 64, 91, 5, 76, 33, 50));
        quicksort(list, 0, list.size() - 1);
        System.out.println(list);
    } 
}

