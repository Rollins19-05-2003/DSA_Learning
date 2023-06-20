package function;

public class bin2Dec {
    public static void myBin2Dec(int binary)
    {
        int dec=0,myNum = binary;
        int pow=0;
        while (binary>0) {
            int lastDigit = binary%10;
            dec = dec + lastDigit * (int)Math.pow(2, pow);
            pow++;
            binary = binary/10;
        }
        System.out.println("Decimal of " + myNum + " is " + dec);
    }
    public static void main(String[] args) {
     myBin2Dec(1000);   
    }
}
