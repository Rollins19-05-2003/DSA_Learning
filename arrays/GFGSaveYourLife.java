package arrays;
import java.util.*;

public class GFGSaveYourLife {
    static String maxSum(String w, char x[], int b[], int n){
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(x[i], b[i]);
        }

        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (char c : w.toCharArray()) {
            curr += map.containsKey(c)? map.get(c) : c;
            temp.append(c);

            if (curr>max) {
                max = curr;
                ans = new StringBuilder(temp);
            }

            if (curr<0) {
                curr = 0;
                temp = new StringBuilder();
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
       String W = "abcde";
       int N = 1;
       char X[] = { 'c' };
       int B[] = { -1000 };

        System.out.println(maxSum(W, X, B, N));
    }
}
