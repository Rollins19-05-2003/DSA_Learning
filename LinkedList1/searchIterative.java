package LinkedList1;

public class searchIterative {

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
    
    public void addFirstMethod(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
        public int itrSearch(int key) {
            Node temp = head;
            int i = 0;

            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
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
        searchIterative si = new searchIterative();
        si.addFirstMethod(1);
        si.addFirstMethod(18);
        si.addFirstMethod(19);
        si.addFirstMethod(71);
        si.addFirstMethod(81);
        si.addFirstMethod(110);
        si.addFirstMethod(321);
        si.printNode();
        System.out.println(si.itrSearch(81));
        
    }
}
