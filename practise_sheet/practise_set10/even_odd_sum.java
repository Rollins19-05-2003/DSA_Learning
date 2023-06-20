package practise_set10;

import java.util.Scanner;

public class even_odd_sum {
    // Write a program that reads a set of integers, and then prints the sum of the
    // even and odd integers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, even_sum = 0, odd_sum = 0,choice;
        do {
            System.out.print("Enter the number : ");
            num=sc.nextInt();
            if(num%2==0)
            {
                even_sum+=num;
            }
            else{
                odd_sum+=num;
            }
            System.out.println("Would you like to continue? \n press 1 for yes and 0 for exit");
            choice = sc.nextInt();
        } while (choice>0);

        System.out.println("Sum of even number : "+even_sum);
        System.out.println("Sum of odd number : "+odd_sum);
    }
}
