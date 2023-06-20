package arrays;

import java.util.HashSet;

public class practise1 {
    public static boolean repeat(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean repeatEfficient(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(set)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(repeat(arr));
        System.out.println(repeatEfficient(arr));
    }
}
