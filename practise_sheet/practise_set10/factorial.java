package practise_set10;

import java.util.Scanner;

// class fact {
//     void factorial() {
//         int fact = 1;
//         for (int i = 1; i <=num; i++) {
//             fact = fact * i;
//         }
//         System.out.println("The factorial of the number is : " + fact);
//     }
// }

class fact {
    int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        } else if (num == 0 || num == 1) {
            return 1;
        }
        return 0;
    }
}

public class factorial {
    // Question 3 :Write a program to find the factorial of any number entered by
    // the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        fact f = new fact();
        int result = f.factorial(num);
        System.out.print(result);

    }
}
