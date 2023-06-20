package Stack;
import java.util.Stack;
public class validParentheses {

    public static boolean valid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // opening bracket
            if (ch =='(' || ch == '{' || ch == '[') {
                s.push(ch);
            }else{
                // closing
                if (s.isEmpty()) {  // --> this condition is for chechking whether the stack only contain closing bracket so nothing is pushed
                    return false;
                }
                if ((s.peek() == '(' && ch ==')') || (s.peek() == '{' && ch =='}') || (s.peek() == '[' && ch ==']') ) {
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;            
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "})]";
        System.out.println(valid(str));
    }
}
