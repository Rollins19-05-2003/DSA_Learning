package DP_Part1;

public class knapsack01 {
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackRecursive(int wt[], int value[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n-1]<=W) {
            return Math.max(value[n-1] + knapsackRecursive(wt, value, W-wt[n-1], n-1) , knapsackRecursive(wt, value, W, n-1));
        }
        else{
            return knapsackRecursive(wt, value, W, n-1);
        }
    }

    public static int knapsackMemoized(int wt[], int value[], int W, int n, int dp[][]) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n-1]<=W) {
            dp[n][W] = Math.max(value[n-1] + knapsackMemoized(wt, value, W-wt[n-1], n-1,dp) , knapsackMemoized(wt, value, W, n-1,dp));
            return dp[n][W];
        }
        else{
            dp[n][W] = knapsackMemoized(wt, value, W, n-1,dp);
            return dp[n][W];
        }
    }

    public static int knapsackTabular(int wt[] ,int value[] , int W) {
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
                    dp[i][j] = Math.max(value[i-1] + dp[i-1][j - wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void main(String[] args) {
        int value[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[value.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Recursive : "+knapsackRecursive(wt, value, W, value.length));
        System.out.println("Memoized : "+knapsackMemoized(wt, value, W, value.length, dp));
        System.out.println("Tabular : "+knapsackTabular(wt, value, W));
    }
    
}