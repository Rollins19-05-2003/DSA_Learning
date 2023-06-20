package recursion;

public class factorialRecursion {

    public static int factorialNum(int n) {
        // recursive approach
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialNum(n - 1);
        }

        // iterative approach
        // int result = 1;
        // for (int i = 1; i <=n; i++) {
        // result = result * i;
        // }
        // return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialNum(6));
    }
}
