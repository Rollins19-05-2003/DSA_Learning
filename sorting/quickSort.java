package sorting;
public class quickSort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;


    }
    public static void quickSortMethod(int arr[], int low, int high){
        if (low < high) {
            int pidx = partition(arr,low,high);

            quickSortMethod(arr, low, pidx-1);
            quickSortMethod(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,7,34,1,89,6};
        int n = arr.length;
        quickSortMethod(arr,0,n-1);

        // print

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
}