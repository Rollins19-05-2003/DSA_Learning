package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class stackAndQueueUsingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);    
        }
        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public void addQ(int data){
            deque.addLast(data);    
        }
        public int removeQ(){
            return deque.removeFirst();
        }

        public int peekQ(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        Queue q = new Queue();
        q.addQ(1);
        q.addQ(2);
        q.addQ(3);

        System.out.println("Peek : " + q.peekQ());

        System.out.println(q.removeQ());
        System.out.println(q.removeQ());
        System.out.println(q.removeQ());
    }
}
