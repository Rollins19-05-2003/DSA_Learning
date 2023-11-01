package string;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "heart";        
        String s2 = "earth";

        if (s1.length() != s2.length()) {
            System.out.println(s1 + " and " + s2 + " are not anagram of each other");
        }
        else{
            s1 = s1.toLowerCase();            
            s2 = s2.toLowerCase();

            char[] s1charArray = s1.toCharArray();            
            char[] s2charArray = s2.toCharArray(); 
 
            Arrays.sort(s1charArray);            
            Arrays.sort(s2charArray);

            boolean result = Arrays.equals(s1charArray, s2charArray);
            if (result) {
                System.out.println(s1 + " and " + s2 + " are anagram of each other");
            }else{
                System.out.println(s1 + " and " + s2 + " are not anagram of each other");

            }

        }
    }
}
