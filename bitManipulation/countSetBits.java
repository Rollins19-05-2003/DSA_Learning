// Amazon Google
package bitManipulation;

public class countSetBits {
    public static int countSetBitsMethod(int n) {
        int count = 0;
        while(n > 0)
        {
            if((n & 1) != 0){   // Check least Significant bit
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBitsMethod(8));
    }
}
