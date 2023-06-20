package bitManipulation;

public class practise2 {
    public static void main(String[] args) {
        // Ques. swap without third variable
        int a = 12,b = 54;
        System.out.println(a + " " + b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

        int x = 12,y = 32;
        System.out.println(x + " " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);

    }
}
