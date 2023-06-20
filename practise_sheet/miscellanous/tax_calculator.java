package miscellanous;
import java.util.Scanner;
public class tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax = 0;

        if (income<=500000)
        {
            tax = 0;
            System.out.println("0% tax ");
        }else if (income>500000 && income<=1000000) {
            tax=(int)(income*0.2);
            System.out.println("20% tax"+tax);
            income=income-tax;
            System.out.println("Final income"+income);
        }
        else{
            tax=(int)(income*0.3);
            System.out.println("30% tax "+tax);
            income=income-tax;
            System.out.println("Final income "+income);
        }
    }
}
