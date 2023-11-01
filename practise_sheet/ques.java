

public class ques {
    public static int solution(int[] A, int X, int Y) {
        int N = A.length;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < Y; i++) {
            int count = 0;
            int sum = 0;
            int start = i;
            int end = i;

            while (end < N) {
                sum += A[end]; // [end]!
                count++;

                if (count == X) {
                    res = Math.min(res, sum);
                    sum -= A[start];
                    start += Y;
                    count--;
                }
                end += Y;
            }
        }

        return res;
    }

    public static void main(String[] args) {


        int[] A1 = {4, 2, 3, 7};
        int X1 = 2;
        int Y1 = 2;
        System.out.println("Test Case 1: " + solution(A1,X1, Y1)); // Expected output: 7

        int[] A2 = {10, 3, 4, 7};
        int X2 = 2;
        int Y2 = 3;
        System.out.println("Test Case 2: " + solution(A2, X2, Y2)); // Expected output: 17

        int[] A3 = {4, 2, 5, 4, 3, 5, 1, 4, 2, 7};
        int X3 = 3;
        int Y3 = 2;
        System.out.println("Test Case 3: " + solution(A3, X3, Y3)); // Expected output: 6
    }
}

