package Divide_and_Conquere;

public class quickSort {
    public static void quick(int arr[], int start, int end) {
        if(start>=end){
            return;
        }
        int pidx = partition(arr, start, end);
        quick(arr, start, pidx-1);  // left
        quick(arr, pidx+1, end);    // right
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if(arr[j] <= pivot){
                i++;
                //swap with smaller element than pivot
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        // bringing pivot to its position (i.e., from end to its place)
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8};
        quick(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
