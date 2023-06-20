package arrays;

public class subArrays {

    public static void subArray(int arr[]) {
        int total_subarray = 0; // n*(n+1)/2
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {// j=i not i+1 because we have to print the single element also
                int end = j;
                for (int k = start; k <= end; k++) {// print
                    System.out.print(arr[k] + " ");
                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays is : " + total_subarray);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArray(arr);
    }
}