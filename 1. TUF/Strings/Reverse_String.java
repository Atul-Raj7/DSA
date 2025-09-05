// Lc - 344

import java.util.Arrays;
public class Reverse_String {
    static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while(i < j){
        char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        char[] str = {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(Arrays.toString(str));
    }
}
