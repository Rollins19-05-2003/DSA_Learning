package DP_Part3;

public class LCS {

    public static int LCSRecursive(String a, String b, int m, int n) {
        // Base conndition
        if (m == 0 || n == 0) {
            return 0;
        }
        if (a.charAt(m-1) == b.charAt(n-1)) {
            return 1 + LCSRecursive(a, b, m-1, n-1);
        }
        else{
            return Math.max(LCSRecursive(a, b, m-1, n), LCSRecursive(a, b, m, n-1));
        }
    }

    public static int LCSMemoization(String a, String b, int m, int n, int t[][]) {
        // Base conndition
        if (m == 0 || n == 0) {
            return 0;
        }
        if (t[m][n] != -1) {
            return t[m][n];
        }
        if (a.charAt(m-1) == b.charAt(n-1)) {
            return t[m][n] = 1 + LCSMemoization(a, b, m-1, n-1,t);
        }
        else{
            return t[m][n] = Math.max(LCSMemoization(a, b, m-1, n,t), LCSMemoization(a, b, m, n-1,t));
        }
    }

    public static int LCSTabulation(String a, String b, int m, int n) {
        int t[][] = new int[m+1][n+1];
        // Base conndition
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] =  0;
                }  
            }
        }

        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {

                if (a.charAt(i-1) == b.charAt(j-1)) {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }

    public static void main(String[] args) {
        String a = "abcdge";
        String b = "acedg";
        int m = a.length();
        int n = b.length();
        // System.out.println(LCSRecursive(a,b,m,n));

        int t[][] = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                t[i][j] = -1;
            }
        }
        // System.out.println(LCSMemoization(a,b,a.length(),b.length(),t));
        System.out.println(LCSTabulation(a,b,a.length(),b.length()));
    }
}
