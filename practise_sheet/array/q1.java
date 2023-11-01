package array;

import java.util.HashSet;

public class q1 {
    // brute force
    public static boolean containsDuplicate(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // hashSet
        public static boolean containsDuplicate_II(int arr[]){
            HashSet<Integer> s = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (s.contains(arr[i])) {
                    return true;
                }
                s.add(arr[i]);
            }
            return false;
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int arr2[] = {1,2,3,4};
        System.out.println(containsDuplicate(arr));        
        System.out.println(containsDuplicate(arr2));
    }
}
