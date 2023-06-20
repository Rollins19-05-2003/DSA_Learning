package recursion;

public class fibonacci {
    public static void fibonacciIterative(int n) {
        int a = 0,b=1,c=0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <=n; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+ " ");
        }
    } 

    public static int fibonacciRecursive(int n) {
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }
    public static void main(String[] args) {
        fibonacciIterative(25);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
}
