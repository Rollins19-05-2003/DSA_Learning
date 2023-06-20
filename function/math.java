package function;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Square of " + num + " is " + (int)Math.pow(num, 2) );
        System.out.println("Square root of " + num + " is " + (int)Math.sqrt(num));
        System.out.println(Math.max(12, 1));
        System.out.println(Math.min(12, 1));
        System.out.println(Math.abs(-2332));

    }
}
