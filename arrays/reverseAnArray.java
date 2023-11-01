package arrays;

public class reverseAnArray {

    public static void reverse(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 1, 2234, 34, 456, 5, 34, 6 };
        printArray(array);
        reverse(array);
        printArray(array);
        
    }

}
