package arrayList;

import java.util.ArrayList;

public class swap {

    public static void swapNumber(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.print(list1 + " ");
        swapNumber(list1, idx1, idx2);
        System.out.print(list1 + " ");

    } 
}