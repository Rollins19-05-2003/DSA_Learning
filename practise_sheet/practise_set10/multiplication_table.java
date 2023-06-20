package practise_set10;
import java.util.Scanner;
// Question4: Write a program to print the multiplication table of a number N, entered by the user
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication table of : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}