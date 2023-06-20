package DP_Part5.DP_Part6;

// import java.util.Arrays;

public class MCM {

    public static int MCMRecursiveCode(int i, int j, int arr[]) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = MCMRecursiveCode(i, k, arr); // size --> arr[i-1]*arr[k]
            int cost2 = MCMRecursiveCode(k + 1, j, arr); // size --> arr[k]*arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost3 + cost2;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    public static int MCM_MemoizedCode(int i, int j, int dp[][], int arr[]) {
        if (i == j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = MCM_MemoizedCode(i, k, dp, arr); // size --> arr[i-1]*arr[k]
            int cost2 = MCM_MemoizedCode(k + 1, j, dp, arr); // size --> arr[k]*arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost3 + cost2;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }

    public static int MCM_TabulationCode(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        // initialization
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // bottom-up
        for (int len = 2; len <= n-1; len++) {
            for (int i = 1; i <= n-len; i++) {
                int j = i+len - 1;  // col
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j-1; k++) {
                    int cost1 = dp[i][k];    // size --> arr[i-1]*arr[k]
                    int cost2 = dp[k+1][j]; // size --> arr[k]*arr[j]
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        // int n = arr.length;
        // int dp[][] = new int[n][n];
        // for (int i = 0; i < n; i++) {
        // Arrays.fill(dp[i], -1);
        // }
        // System.out.println(MCMRecursiveCode(1, n-1, arr));
        // System.out.println(MCM_MemoizedCode(1, n-1, dp, arr));
        System.out.println(MCM_TabulationCode(arr));
    }
}
