package arrays;

public class maxSubArrayPrefixSum {

    public static void MyMaxSubArrayPrefixSum(int arr[]) {
        {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
            int prefix[] = new int[arr.length];
            prefix[0] = arr[0];

            // calculating prefix array
            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                int start = i;
                for (int j = i; j < arr.length; j++) {
                    int end = j;
                    currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                    //                                                    prefix[0-1] --> (-1) not valid so only prefix[end] is written
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }

                }

            }
            System.out.println("MAX sum is : " + maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int arr2[] = {2,4,6,8,10};
        MyMaxSubArrayPrefixSum(arr);
        MyMaxSubArrayPrefixSum(arr2);
    }
}
