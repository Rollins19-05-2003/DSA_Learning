package arrays;

// Brute Force  --> n^3 time complexity
public class maxSubarraySum {
    public static void MaxSumSubArray(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for (int i = 0; i < arr.length; i++) {
    int start = i;
        for (int j = i; j < arr.length; j++) {
            int end = j;
            currentSum = 0;
            for (int k = start; k <= end; k++) {
                // subarray sum
                currentSum += arr[k];
            }
            System.out.print(currentSum + " ");
            if (currentSum > maxSum) {
            maxSum = currentSum;
            }
        }
        System.out.println();
    }
    System.out.println("MAX sum is : " + maxSum);
}
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MaxSumSubArray(arr);
    }
}