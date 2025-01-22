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
