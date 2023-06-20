package LinkedListDoubly;

public class doublyLL {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

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

    public static int removeFirst() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return -1;
        } 

        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
            int val = head.data;
            head = head.next;   // this line will give error when there is only one node so we have to write a special case for it
            head.prev = null;
            size--;
            return val;
    }

    public static int removeLast() {
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
    public static void main(String[] args) {
        doublyLL dd = new doublyLL();
        dd.addFirst(12);
        dd.addFirst(13);
        dd.addFirst(14);
        dd.addFirst(15);
        dd.addFirst(16);
        System.out.println("Add first method : ");
        dd.printNode();

        // add last
        dd.addLast(99);
        System.out.println("Add Last method : ");
        dd.printNode();
        System.out.println("Its size is : " + dd.size);

        // removeFirst
        dd.removeFirst();
        System.out.println("After removeFirst method is called : ");
        dd.printNode();
        System.out.println("Its size is : " + dd.size);

        // remove last
        dd.removeLast();
        System.out.println("After removeLast method is called : ");
        dd.printNode();
        System.out.println("Its size is : " + dd.size);
   
    }
}
