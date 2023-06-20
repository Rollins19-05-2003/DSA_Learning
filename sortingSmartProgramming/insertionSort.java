package sortingSmartProgramming;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {45,23,0,86,2,12,5,99};
        int temp,j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j>0 && temp<arr[j-1]) {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;

        }

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + " ");
        }
    }
}
