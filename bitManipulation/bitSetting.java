package bitManipulation;

public class bitSetting {

    public static int setithBitMethod(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int getithBitMethod(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int clearithBitMethod(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateithBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearithBitMethod(n, i);
        } else {
            return setithBitMethod(n, i);
        }
    }
    public static int  clearLastithBit(int n, int i) {
        int bitmask = (-1) << i;  // bitmask = (~0) << i; [OR] = (15)<<i because -1 = 1111[15] in bit
        return n & bitmask;
    }
    public static int clearRangeOfBit(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(getithBitMethod(10, 3));
        System.out.println(setithBitMethod(10, 0));
        System.out.println(clearithBitMethod(10, 1));
        System.out.println(updateithBit(10, 1, 0));
        System.out.println(clearLastithBit(15, 2));
        System.out.println(clearRangeOfBit(10,2,4));
    }

}
