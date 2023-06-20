package Stack;

import java.util.Stack;

public class nextGreaterElement {
// next greater right 
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreaterElement[] = new int[arr.length];

        for (int i = arr.length -1 ; i >= 0; i--) {
            // 1st --> while
            // 2nd --> if else
            // 1st --> push

            // 1st
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2nd
            if(s.isEmpty()){
                nextGreaterElement[i] = -1;
            }else{
                nextGreaterElement[i] = arr[s.peek()];
            }
            // 3rd
            s.push(i);
        }


        for (int i = 0; i < nextGreaterElement.length; i++) {
                System.out.print(nextGreaterElement[i] + " ");
        }
    }
}

