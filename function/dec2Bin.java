package function;

public class dec2Bin {
    public static void myDec2Bin(int decimal)
    {
        int rem,bin=0,pow=0,myNum = decimal;
        while (decimal>0) {
            rem = decimal%2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
            decimal = decimal/2;
        }
        System.out.println("Binary of "+myNum + " is " + bin);
    }
    public static void main(String[] args) {
        myDec2Bin(-1);
    }
    
}
