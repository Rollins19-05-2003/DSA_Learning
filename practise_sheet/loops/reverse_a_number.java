package loops;
import java.util.Scanner;
public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter the number you want to do the reverse of : ");
        int num = sc.nextInt();
        // int reverse=0,rem;
        // while (num>0) {
        //     rem = num%10;
        //     reverse = (reverse*10) + rem;
        //     num/=10;
        // }

        
        // StringBuffer sb = new StringBuffer(String.valueOf(num));
        // StringBuffer reverse = sb.reverse();
        // System.out.println("The reverse of the number is : "+reverse);


        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev = sb1.reverse();
        System.out.println("Reverse is : "+rev);

    }
}