package Stack;
import java.util.Stack;
public class reverseAStack {

    public static void pushAtBottomMethod(Stack<Integer> s ,int value) {
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottomMethod(s, value);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottomMethod(s, top);
    }
    public static void printStack(Stack<Integer> s)
    {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        printStack(s);

    }
}
