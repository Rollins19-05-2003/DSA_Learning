package Divide_and_Conquere;
public class searchInSortedRotatedArray {

    public static int search(int arr[], int target, int start, int end) {
        if(start > end){
            return -1;
        }
        // kaam
        int mid = start + (end - start) / 2;

        // case mid == target_element
        if (arr[mid] == target) {
            return mid;
        }
        // mid on line 1
        if (arr[start] <= arr[mid]) {
            // case a : LEFT
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid);
                // case b : RIGHT
            } else {
                return search(arr, target, mid + 1, end);
            } 
        }

        // mid on line 2
        else {
            // case c : right
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            }
            // case d : left
            else {
                return search(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // o/p --> 4
        int target_idx = search(arr, target, 0, arr.length - 1);
        System.out.println(target_idx);
    }
}


          