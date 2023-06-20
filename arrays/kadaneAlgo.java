package arrays;

public class kadaneAlgo {
    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Our max subaaray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, -2, 6, -1, 3 };
        int arr2[] = { 2, 4, 6, 8, 10 };
        int arr3[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadanes(arr3);
        kadanes(arr2);
        kadanes(arr1);
    }
}
