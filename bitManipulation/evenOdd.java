package bitManipulation;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int bitmask = 1;
        if((a & bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

    }
    
}
