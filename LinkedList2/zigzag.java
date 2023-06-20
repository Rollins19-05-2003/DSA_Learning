package LinkedList2;

public class zigzag {

    public static Node head;
    public static Node tail;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node findMid() {
        Node slow = head;
        Node fast = head.next; // so that we can get the last node of the 1st half as our mid

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void addFirstMethod(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
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

    public void zizagMethod() {
        // 1st --> find mid
        Node mid = findMid();

        // 2nd --> reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate merging
        Node leftH = head;
        Node rightH = prev;
        Node nextL, nextR;

        while (leftH != null && rightH != null) { // visualize with the help of the diagram
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;
            rightH = nextR;
            leftH = nextL;
        }
    }

    public static void main(String[] args) {
        zigzag zz = new zigzag();
        zz.addFirstMethod(12);
        zz.addFirstMethod(13);
        zz.addFirstMethod(14);
        zz.addFirstMethod(15);
        zz.addFirstMethod(16);
        zz.addFirstMethod(17);

        // 17 -> 16 -> 15 -> 14 -> 13 -> 12 -> null
        zz.printNode();
        zz.zizagMethod();
        zz.printNode();
    }
}
