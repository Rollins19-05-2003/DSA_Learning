package recursion;

public class xPowerN {
    //recursively
    public static int xPowerNRecursive(int x, int n) {
        if(n == 0){
            return 1;
        }
        return x * xPowerNRecursive(x, n-1);
    }

    public static int xPowerNIterative(int x, int n) {
        int result = 1;
        for (int i = 1; i <=n; i++) {
            result = result * x;
        }
        return result;
    }

    public static int xPowerNRecursiveOptimized(int x , int n) {
        if(n == 0){
            return 1;
        }

        if(n%2 == 0){
            int result = xPowerNIterative(x, n/2);
            return result*result;
        }
        else{
            int result = xPowerNIterative(x, n/2);
            return x * result * result ;

        }
    }    
    public static void main(String[] args) {
        System.out.println("Recursively : "+xPowerNRecursive(2, 10));
        System.out.println("Iteratively : "+xPowerNIterative(2, 10));
        System.out.println("Recursively Optimized : "+ xPowerNRecursiveOptimized(2, 7));
    }
}
