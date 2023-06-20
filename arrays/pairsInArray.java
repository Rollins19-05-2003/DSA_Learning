package arrays;
public class pairsInArray {
    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairs(arr);
        // Total number of pairs
        int n = arr.length;
        int tp = n*(n-1)/2;
        System.out.println("Total pairs is : "+ tp);
    }
}