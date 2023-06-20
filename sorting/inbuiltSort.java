package sorting;
import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    
        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        
        // Ascending order sorting we use Arrays class
        // Arrays.sort(arr);
        // Arrays.sort(arr,1,3);

        // Descending order sorting we use collections
        
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
