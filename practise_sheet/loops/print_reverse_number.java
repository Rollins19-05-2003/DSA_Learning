package loops;

import java.util.Scanner;

public class print_reverse_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print the reverse of :");
        int num = sc.nextInt();
        // 201
        int target = num;
        while (target >0) {
            int reverse = target % 10;
            System.out.print(reverse);
            target = target / 10;
        }
        System.out.println("\n");
        System.out.println("Original number " + num);
    }

}
