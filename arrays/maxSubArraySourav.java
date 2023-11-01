package arrays;

public class maxSubArraySourav {

    public static void MyMaxSubArrayPrefixSum(int arr[]) {
        {
            int maxSum = Integer.MIN_VALUE;
            int currentSum ;

            for (int i = 0; i < arr.length; i++) {
                currentSum = 0;
                for (int j = i; j < arr.length; j++) {
                    currentSum += arr[j];
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                    System.out.println(currentSum);
                }
            }
            System.out.println("MAX sum is : " + maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int arr2[] = { 2, 4, 6, 8, 10 };
        MyMaxSubArrayPrefixSum(arr);
        MyMaxSubArrayPrefixSum(arr2);

    }
}