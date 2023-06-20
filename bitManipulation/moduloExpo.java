package bitManipulation;
// Google
public class moduloExpo {
    public static int moduloExpoMethod(int number, int pow, int mod) {
        int ans = 1;
        while(pow>0){
            if((pow&1) != 0){
                ans = (ans * number)%mod;
            }
            number = (number*number)%mod;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(moduloExpoMethod(3, 5, 100));
        System.out.println(moduloExpoMethod(5, 3, 100));
    }
}
