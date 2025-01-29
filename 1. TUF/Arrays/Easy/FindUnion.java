import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindUnion {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            set.add(b[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int[] b = {4,5,6,1,2,9};
        System.out.print(findUnion(a, b));
    }
}

