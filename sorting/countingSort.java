package sorting;

public class countingSort {
    public static void count(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting --> putting the value in the original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;     //original array
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,6,23,6,78,423,43,45,1};
        // int arr[] = {1,4,1,3,2,4,3,7};
        count(arr);
        printArr(arr);
    }
}
