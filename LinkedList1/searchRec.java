package LinkedList1;

public class searchRec {
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

    public int helperRECsearch(Node head, int key) {
        if(head==null){return-1;}
        if(head.data==key){return 0;}
        int idx = helperRECsearch(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key) {
        return helperRECsearch(head,key);
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
        searchRec si = new searchRec();
        si.addFirstMethod(1);
        si.addFirstMethod(18);
        si.addFirstMethod(19);
        si.addFirstMethod(71);
        si.addFirstMethod(81);
        si.addFirstMethod(110);
        si.addFirstMethod(321);
        si.printNode();
        System.out.println(si.recSearch(19));

    }
}
