package LinkedList1;
public class addMiddle {
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


        public void addMiddleMethod(int index, int data){
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i<index-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void addLastMethod(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }
    
        public void printNode(){
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
        addMiddle am = new addMiddle();
        am.addLastMethod(32);
        am.addLastMethod(42);
        am.addLastMethod(12);
        am.addLastMethod(72);
        am.addLastMethod(92);
        am.addMiddleMethod(2, 567);
        am.printNode();
    }
}
