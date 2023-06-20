package LinkedList1;

public class removeLast {
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
    static int size;

    public void addLastMethod(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int removeLastMethod() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return -1;
        }
        Node temp = head;
        // for (int i = 0; i < size - 2; i++) {
        //     temp = temp.next;
        // }
        while (temp.next.next != null) {
            temp = temp.next;   
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

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
        removeLast am = new removeLast();
        am.addLastMethod(32);
        am.addLastMethod(42);
        am.addLastMethod(12);
        am.addLastMethod(72);
        am.addLastMethod(92);
        System.out.print("Before removing : ");
        am.printNode();
        System.out.print("After removing : ");
        am.removeLastMethod();
        am.printNode();
        System.out.println("SIZE : "+am.size);

    }
}