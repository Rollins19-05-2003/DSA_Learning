package bitManipulation;

public class fastExponential {
    public static int fastExponentialMethod(int number,int power) {
        int ans = 1;
        while(power>0){
            if((power & 1)!=0){    //check LSB
                ans = ans * number; // ans = 1*3 = 3 --> 3 * 81 = 243
            }
            number = number * number;   // 3*3 = 9  --> 9*9 = 81 --> 81*81
            power = power >> 1;         // 101 --> 010 --> 001 --> 000(false)
        }
        return ans; // 243
    }

    public static void main(String[] args) {
        System.out.println(fastExponentialMethod(3, 5));
    }
}
