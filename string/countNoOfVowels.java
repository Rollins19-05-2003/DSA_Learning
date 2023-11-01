package string;
import java.util.Scanner;
// Count how many times lowercase vowels occurred in a String entered by the user
public class countNoOfVowels {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
