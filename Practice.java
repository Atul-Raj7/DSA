import java.util.*;

public class Practice{
 
        static ArrayList<Integer> lol(int arr1[], int arr2[]){
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            int n1 = arr1.length;
            int n2 = arr2.length;
            int i = 0;
            int j = 0;

            while(i < n1 && j < n2){
                if(arr1[i] < arr2[j]){
                    if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                        list.add(arr1[i]);
                        i++;
                    }
                }
                else if(arr1[i] > arr2[j]){
                    if(list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                        list.add(arr2[i]);
                        j++;
                    }
                }
                else{
                    if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                        list.add(arr1[i]);
                    }
                    i++;
                    j++;
                }
            }
            while(i < n1){
                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                    i++;
                }
            }
            while(j < n2){
                if(list.size() == 0 || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }
            }

            return list;
        }
    
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(lol(arr1, arr2));
    }
}