package LinkedList2;

import java.util.LinkedList;

public class LLinCollectionsFramework {
        public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList<>();
            ll.addFirst(12);
            ll.addFirst(11);
            ll.addFirst(10);
            ll.addFirst(9);
            ll.addLast(13);
            System.out.println(ll.get(3));
            System.out.println(ll);
            ll.removeFirst();
            ll.removeLast();
            System.out.println(ll);
        }
}
