package Stack;

import java.util.Stack;

// AMAZON
public class pushAtBottom {

    public static void pushAtBottomMethod(Stack<Integer> s ,int value) {
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottomMethod(s, value);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottomMethod(s,4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
