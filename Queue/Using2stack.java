package Queue;

import java.util.Stack;

public class Using2stack {
    static class Queue {
    
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // empty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add --> O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
    
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public static int remove() {
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(12);
        q.add(13);
        q.add(14);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
