package miscellanous;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        String type = (num%2==0) ? "Even"  : "Odd";
        System.out.println(type);

        // if (num % 2==0) {
        //     System.out.println("It is an even number");
        // } else {
        //     System.out.println("odd numbers");
        // }
    }
}