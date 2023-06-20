package recursion;

public class PrintBinaryString {
    public static void PrintBinaryStringMethod(int n,int lastPlace ,String str) {
        if(n==0){
            System.out.println(str);
            return;
        }
        if (lastPlace==0){
            PrintBinaryStringMethod(n-1, 0, str + "0");
            PrintBinaryStringMethod(n-1, 1, str + "1");
        }
        else{
            PrintBinaryStringMethod(n-1, 0, str + "0");
        }
    }
    public static void main(String[] args) {
        PrintBinaryStringMethod(3, 0, "");
    }
}
