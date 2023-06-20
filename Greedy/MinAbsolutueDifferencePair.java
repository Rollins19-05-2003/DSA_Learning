package Greedy;
import java.util.*;
public class MinAbsolutueDifferencePair {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDifference = 0;

        for (int i = 0; i < b.length; i++) {
            minDifference += Math.abs(a[i] - b[i]);
        }
        System.out.println("Mininum absolute difference pair is : "+minDifference);
    }
}
