package function;

public class reverseString {
    public static void PrintReverseAString(String str) {
        System.out.println("Original String : " + str);
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    // Logic 1
    public static void ReverseAString(String str) {
        System.out.println("Original String : " + str);
        String rev = " ";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String using algo :" + rev);
    }
    //Logic 2
    public static void ReverseAString2(String str) {
        System.out.println("Original String : " + str);
        String rev = " ";
        char a[] = str.toCharArray();
        for (int i = a.length - 1; i >=0; i--) {
            rev = rev + a[i];
        }
        System.out.println("Reversed String using character array :" + rev);
    }
    // Logic 3
    public static void ReverseAString3(String str) {
        System.out.println("Original String : " + str);
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reversed String using StringBuffer array : "+sb.reverse());
    }
    public static void main(String[] args) {
        String str = "Sourav";
        PrintReverseAString(str);
        System.out.println();
        ReverseAString(str);
        ReverseAString2(str);
        ReverseAString3(str);
    }
}
