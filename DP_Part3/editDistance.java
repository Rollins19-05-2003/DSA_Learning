package DP_Part3;

public class editDistance {
    public static int editDistanceMethod(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int[m+1][n+1];
        // initialization
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if (i==0) {
                    dp[i][j] = j;
                }
                if (j==0) {
                    dp[i][j] = i;
                }
            }
        }

        // bottom up]
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int insert = dp[i][j-1] + 1;
                    int delete = dp[i-1][j] + 1;
                    int replace = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editDistanceMethod(word1, word2));
    }
}
