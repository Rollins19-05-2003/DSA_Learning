package function;
import java.util.Scanner;
public class functions {
    public static void swap(int a, int b)
    {
        System.out.println("Before Swapping : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    public static int product(int a, int b)
    {
        int multiply = a*b;
        return multiply;
    }

    public static int factorial(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }

    public static int bino_coeff(int n, int r)
    {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int result = a/(b*c);
        return result;
    }
    public static void main(String[] args) {
        // always call by value
        // swap(1,2);
        // System.out.println(product(12, 3));
        // System.out.println(factorial(7));
        System.out.println(bino_coeff(3, 2));
    }
}