package LinkedListDoubly;

public class doublyLLReverse {
    public static Node head;
    public static Node tail;
    public static int size;

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void reverse(){  // 3 var 5 step
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void printNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLLReverse ddr = new doublyLLReverse();
        ddr.addFirst(3);
        ddr.addFirst(2);
        ddr.addFirst(1);

        ddr.printNode();

        ddr.reverse();

        ddr.printNode();
    }
}
