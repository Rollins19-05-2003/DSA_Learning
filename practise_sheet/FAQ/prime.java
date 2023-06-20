package FAQ;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        Boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        if (isPrime == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}