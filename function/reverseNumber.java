package function;

import java.util.Scanner;

public class reverseNumber {
    // 1st logic
    public static int reverseANumber(int n) {
        int rev = 0,rem;
        while(n!=0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }

    // 2nd logic using StringBuffer
    public static StringBuffer reverseANumber2(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        return rev;
    }

    // 3rd Logic using StringBuilder
    public static StringBuilder reverseANumber3(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Original number : " + num);
        System.out.println("Reversed number using algo : "+ reverseANumber(num));
        System.out.println("Reversed number using StringBuffer : " + reverseANumber2(num));
        System.out.println("Reversed number using StringBuilder : " + reverseANumber3(num));
        sc.close();
    }
}
