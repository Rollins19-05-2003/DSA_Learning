package Queue;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class queueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> s = new Stack<>();
        // int size = q.size();
        // for (int i = 0; i < size; i++) {
        //     s.push(q.remove());
        // }

        // while (!s.isEmpty()) {
        //     System.out.print(s.pop() + " ");
        // }
        // System.out.println();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
