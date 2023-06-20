package arrayList;
import java.util.ArrayList;
public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // 1. add operation || Time complexity --> O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        // 1 -> (a) add (index,position) || Time complexity --> O(n)
        list1.add(1, 99);
        System.out.println(list1);

        // 2. get operation || Time complexity --> O(1)
        System.out.println(list1.get(3));

        // 3. Delete operation || Time complexity --> O(n)
        list1.remove(2);
        System.out.println(list1);

        // 4. set element at index || Time complexity --> O(n)
        list1.set(2, 34);
        System.out.println(list1);

        // 5. contains || Time complexity --> O(n)
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(14));

        // 6. length
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        
    }
}
