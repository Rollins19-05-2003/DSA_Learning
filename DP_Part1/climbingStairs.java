package DP_Part1;

import java.util.Arrays;

public class climbingStairs {
    public static int NoOfWaysRecursive(int n) {
        if (n == 0) {
            return 1;
        } 
        if (n<0) {
            return 0;
        }    
        return NoOfWaysRecursive(n-1) + NoOfWaysRecursive(n-2);
        
    }

    public static int NoOfWaysMemoized(int n,int ways[]) {
        if (n == 0) {
            return 1;
        } 
        if (n<0) {
            return 0;
        }    

        if (ways[n] != -1) {
            return ways[n];
        }
        return ways[n] = NoOfWaysMemoized(n-1,ways) + NoOfWaysMemoized(n-2,ways);
        
    }

    public static int NoOfWaysTabulation(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
       // Tabulation Loop
       for (int i = 1; i < dp.length; i++) {
            if (i == 1) {
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
       }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println("Recursive "+NoOfWaysRecursive(n));
        System.out.println("Top Down "+NoOfWaysMemoized(n,ways));
        System.out.println("Bottom Up "+NoOfWaysTabulation(n));

    }
}
