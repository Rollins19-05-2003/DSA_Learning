package DP_Part1;

public class coinChange {
    public static int coinChangeMethod(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 1; // 0th column
        }
        for (int j = 1; j < sum+1; j++) {
            dp[0][j] = 0; // 0th row
        }

        // remaining value filling
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }



    public static void main(String[] args) {
        int coins[] = {2,5,3,6};
        int sum = 10;
        System.out.println(coinChangeMethod(coins, sum));
    }
}
