package function;
public class prime {
    public static boolean isPrime(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n==1){
                System.out.println("Prime");
            }
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            } 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(1));
        primeInRange(20);
    }
}
