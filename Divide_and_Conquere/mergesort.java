package Divide_and_Conquere;

public class mergesort {

    public static void mergeSort(int arr[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        // kaam
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        // left(0,3) = 4  right(4,6) = 3 --> (6-0+1) = 7
        int temp[] = new int[end - start + 1];
        int i = start; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // if some left elements are left for comparison
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // if some right elements are left for comparison
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy temp array to original array
        for (k = 0, i = start; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
