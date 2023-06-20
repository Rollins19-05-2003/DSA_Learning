package Graph5.DP1;

public class ClimbingStairs {
    public static int countNoOfSteps(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countNoOfSteps(n-1) + countNoOfSteps(n-2);
    }

    // memoization

    public static void main(String[] args) {
        int  n = 5;
        System.out.println(countNoOfSteps(n));
    }
}
