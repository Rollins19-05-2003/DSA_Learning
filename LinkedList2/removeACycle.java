package LinkedList2;
public class removeACycle {

    public static Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void removeACycleMethod() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // cycle detected
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }
        
        // meeting point
        slow = head;
        Node prev = null;
        while (slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle --> last.next = null
        prev.next = null;
    }
    public static void main(String[] args) {
        removeACycle rac = new removeACycle();
        head = rac.new Node(1);
        Node temp = head.next = rac.new Node(2);
        head.next.next = rac.new Node(3);
        head.next.next.next = temp;
        // head.next.next.next = rac.new Node(4);
        System.out.println(isCycle());
        removeACycleMethod();
        System.out.println(isCycle());
    
    }
}
