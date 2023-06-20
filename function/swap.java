package function;
public class swap {
    public static void print(int a, int b){
        System.out.println("a : " + a + " and b : " + b);
    }
    public static void swapNumber(int a, int b)
    {
        // Logic 1 using 3rd variable
        System.out.println("---------- Using a 3rd Variable ----------");
        print(a, b);
        int temp = a;
        a = b;
        b = temp;
        print(a, b);

        // Logic 2 using + and -
        System.out.println("---------- using + and - ----------");
        print(a, b);
        a = a+b;
        b = a-b;
        a = a-b;
        print(a, b);

        // Logic 3 using * and /
        System.out.println("---------- using * and / ----------");
        print(a, b);
        a = a*b;
        b = a/b;
        a = a/b;
        print(a, b);

        // Logic 4 using XOR(^)
        System.out.println("---------- using XOR(^) ----------");
        print(a, b);
        a = a^b;
        b = a^b;
        a = a^b;
        print(a, b);

        // Logic 5 with single statement
        System.out.println("---------- with single statement ----------");
        print(a, b);
        b = a + b - (a=b);
        print(a, b);

    }
 public static void main(String[] args) {
    swapNumber(12, 3);
 }   
}
