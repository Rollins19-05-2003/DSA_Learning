package LinkedList1;

public class removeFirst {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLastMethod(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static Node deleteMid(Node head)
    {
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        Node slow_ptr = head;
        Node fast_ptr = head;
  
        // Find the middle and previous of middle.
        Node prev = null;
  
        // To store previous of slow_ptr
        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
  
        // Delete the middle node
        prev.next = slow_ptr.next;
  
        return head;
    }


    public static int removeFirstMethod() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return -1;
        } else {
            int val = head.data;
            head = head.next;
            return val;
        }
    }

    public void printNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeFirst am = new removeFirst();
        am.addLastMethod(32);
        am.addLastMethod(42);
        am.addLastMethod(12);
        am.addLastMethod(72);
        am.addLastMethod(92);
        System.out.print("Before removing : ");
        am.printNode();
        System.out.print("After removing : ");
        am.removeFirstMethod();
        am.printNode();

    }
}
