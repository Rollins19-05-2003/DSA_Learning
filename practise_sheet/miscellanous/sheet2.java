package miscellanous;
import java.util.Scanner;

public class sheet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques1-->
        System.out.println("Enter the 1st,2nd and the 3rd number for finding the average : ");
        float first = sc.nextInt();
        float second = sc.nextInt();
        float third = sc.nextInt();
        double average = (first + second + third)/3;

        System.out.println("The average of the number is : " + average);
        
        // Ques2-->
        System.out.print("Enter the side of the square : ");
        int square = sc.nextInt();
        int area = square*square;
        System.out.println("The area of the square is : "+area);

        // Ques3-->
        System.out.println("Enter the price of pencil,pen and eraser : ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;

        System.out.println("Billing amount = " + total);

        float $ = total + (0.18f * total);
        System.out.println("Billing amount with 18% gst is = " + $);

        // Ques4-->
        byte b = 23;
        char c = 's';
        short s = 214;
        double d = 12.3243546;
        int i = 21213;
        float f = 23.44f;
        double result = (f*b)+(i%c)-(d*s);

    }

}
