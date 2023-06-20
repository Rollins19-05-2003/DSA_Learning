package DP_Part3;

import java.util.Arrays;
import java.util.HashSet;

public class longestIncreasingSussequence {
    public static int lcs(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int t[][] = new int[m+1][n+1];
        // initialization
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }

        return t[m][n];
    }

    public static int longestIncreasingSussequenceMethod(int arr1[]) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        for (int j = 0; j < arr1.length; j++) {
            set.add(arr1[j]);
        }

        int arr2[] = new int[set.size()];
        for (int x : set) {
            arr2[i] = x;
            i++;
        }

        Arrays.sort(arr2);
        return lcs(arr1, arr2);
    }
    public static void main(String[] args) {
        int arr1[] = {50,3,10,7,40,80};
        System.out.println(longestIncreasingSussequenceMethod(arr1));
    }
}
