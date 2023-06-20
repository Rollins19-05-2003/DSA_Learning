package bitManipulation;

public class powerOrNot {
    public static boolean powerOrNotMethod(int n) {
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOrNotMethod(32));
        System.out.println(powerOrNotMethod(15));
    }
}
