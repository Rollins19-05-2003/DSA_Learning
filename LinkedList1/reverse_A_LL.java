package LinkedList1;
public class reverse_A_LL {
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

    public void addFirstMethod(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;    // coz current becomes null so previous becomes our head
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
        reverse_A_LL si = new reverse_A_LL();
        si.addFirstMethod(18);
        si.addFirstMethod(1);
        si.addFirstMethod(71);
        si.addFirstMethod(19);
        si.addFirstMethod(321);
        si.addFirstMethod(81);
        si.addFirstMethod(110);
        si.printNode();
        si.reverse();
        si.printNode();

    }
}
