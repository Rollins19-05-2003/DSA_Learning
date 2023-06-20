package DP_Part1;

public class unboundedKnapsack {
     public static int unboundedKnapsackMethod(int wt[] ,int value[] , int W) {
        int n = value.length;
        int dp[][] = new int[n+1][W+1];

        // Initialization
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;   // 0th column
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;   // 0th row
        }

        
        // remaining value filling
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if (wt[i-1] <= j) {
                    dp[i][j] = Math.max(value[i-1] + dp[i][j - wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int value[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(unboundedKnapsackMethod(wt, value, W));


    }
}
