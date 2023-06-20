package sortingSmartProgramming;

public class sorting {

    public static void bubbleSort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        int temp, min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void beforePrintArr(int arr[]) {
        System.out.println("Array before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void AfterPrintArr(int arr[]) {
        System.out.println("Array After Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 38, 52, 9, 18, 6, 62, 13 };
        int arr2[] = {45,23,0,86,23,12,5,99};
        beforePrintArr(arr);
        bubbleSort(arr);
        AfterPrintArr(arr);

        System.out.println();
        beforePrintArr(arr2);
        selectionSort(arr2);
        AfterPrintArr(arr2);
    }

}
