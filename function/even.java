package function;

public class even {
    public static boolean isEven(int num)
    {
        boolean isEven = true;
        for (int i = 1; i <= num; i++) {
            if(num%2!=0)
                return false;
            }
        return isEven;
    }

    public static void main(String[] args) {
        System.out.println(isEven(0));

    }
}
