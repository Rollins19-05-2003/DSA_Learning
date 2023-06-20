package Stack;

import java.util.ArrayList;

public class arrayListImplementation {

    static class Stack{
        static ArrayList<Integer> list1 = new ArrayList<>();
        // isEmpty 
        public static boolean isEmpty(){
            return list1.size() == 0;
        }

        // push
        public static void push(int data){
            list1.add(data);
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list1.get(list1.size()-1);
            list1.remove(list1.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list1.get(list1.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack aa = new Stack();
        aa.push(12);
        aa.push(13);
        aa.push(14);
        aa.push(15);
        aa.push(16);

        while (!aa.isEmpty()) {
            System.out.println(aa.peek());
            aa.pop();
        }

    }
}
