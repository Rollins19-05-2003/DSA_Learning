package string;

public class stringCompression {
    // public static String compressor(String str) {
    //     String newstr = "";
    //     for (int i = 0; i < str.length(); i++) {
    //         Integer count = 1;
    //         while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }
    //         newstr+=str.charAt(i);
    //         if(count>1){
    //             newstr+=count.toString();
    //         }
    //     }
    //     return newstr;
    // }
    public static String compressor(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;  
                i++;
            }
            newStr = newStr + str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String sh = "afsdffg";
        System.out.println(compressor(sh));
    }
}
