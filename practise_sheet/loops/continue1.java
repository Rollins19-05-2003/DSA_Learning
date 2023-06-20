package loops;

import java.util.*;

public class continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Display all numbers entered by the user except multiple of 10
        System.out.println("Keep entering number : ");
        while (true) {
            int num = sc.nextInt();
            if (num %10 == 0) {
                System.out.println("You entered an multiple of 10");
                continue;
            }
        }
    }
}