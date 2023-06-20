package function;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int lastDigit,sum=0;
        while (num>0) {
            lastDigit = num%10;
            sum = sum+lastDigit;
            num/=10;
        }
        System.out.println("Sum of digits is : " + sum);
    }
}
