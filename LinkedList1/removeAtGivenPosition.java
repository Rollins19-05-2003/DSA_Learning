package LinkedList1;

public class removeAtGivenPosition {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int position)
    {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0)
        {
            head = temp.next;
            return;
        }
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args) {
        removeAtGivenPosition list = new removeAtGivenPosition();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Linked list before deletion:");
        list.printList();

        list.deleteNode(3);

        System.out.println("\nLinked list after deletion:");
        list.printList();
    }
}
