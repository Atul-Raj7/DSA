import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindUnion {

    // Optimal 
    /*
     * TC = O(n1 + n2)
     * SC = O(n1 + n2) only because we have to return list to print answer
     */
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                if(list.size() == 0 || list.get(list.size() - 1) != a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else if(a[i] > b[j]){
                if(list.size() == 0 || list.get(list.size() - 1) != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
            else{
                if(list.size() == 0 || list.get(list.size() - 1) != a[i]){
                    list.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        while(i < n1){
            if(list.size() == 0 || list.get(list.size() - 1) != a[i]){
                    list.add(a[i]);
                }
                i++;
        }
        
        while(j < n2){
            if(list.size() == 0 || list.get(list.size() - 1) != b[j]){
                    list.add(b[j]);
                }
                j++;
        }
        
        
        return list;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int[] b = {4,5,6,1,2,9};
        System.out.print(findUnion(a, b));
    }
}


//Bruteforce
/*
    TC = O(nlogn1 + nlogn2) + O(n1 + n2)
    SC = O(n1 + n2) + O(n1 + n2)

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

*/