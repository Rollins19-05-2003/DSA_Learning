package DP_Part3;

public class longestCommonSubstring {
    public static int longestCommonSubstringTabulation(String a, String b, int m, int n) {
        int t[][] = new int[m+1][n+1];
        int ans = 0;
        // initialization
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
                    ans = Math.max(ans, t[i][j]);
                }
                else{
                    t[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String x = "abcde"; // abcdgh
        String y = "abgce"; // acdghr
        int m = x.length();
        int n = y.length();
        System.out.println(longestCommonSubstringTabulation(x, y, m, n));
    }
}
