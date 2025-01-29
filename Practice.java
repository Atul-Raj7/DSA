import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice{

    static void quicksort(List<Integer> list, int low, int high){
        if(low >= high) return;

        int partition = partition(list, low, high);
        quicksort(list, low, partition - 1);
        quicksort(list, partition + 1, high);
    }

    static int partition(List<Integer> list, int low, int high){
        int pivot = list.get(low);
        int i = low;
        int j = high;

        while(i < j){
            while(list.get(i) <= pivot && i < high) i++;
            while(list.get(j) > pivot && j > low) j--;
            int temp;
            if(i < j){
                temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp;
        temp = list.get(j);
        list.set(j, list.get(low));
        list.set(low, temp);
        return j;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(20,14,56,3,9,47,85,90));
        quicksort(list, 0 , list.size() - 1);
        System.out.println(list);
    }
}