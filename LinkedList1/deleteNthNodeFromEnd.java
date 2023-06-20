package LinkedList1;

public class deleteNthNodeFromEnd {
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
    
        // add method in ll
        public void addFirstMethod(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
    
            newNode.next = head;
            head = newNode;
        }

        // delete method in ll
        public void delete(int n) {
            // calculate size
            int size = 0;
            Node temp = head;
            while (temp!= null) {
                temp=temp.next;
                size++;
            }
            if(n == size){  // i.e, head from 1st == size from last(If we want to delete the head)
                head = head.next;
                return;
            }

            int i = 1;
            int idxTofind = size-n; //for assinging previous
            Node prev = head;
            while (i<idxTofind) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
        }


        // print method in ll
        public void printNode() {
            if (head == null) {
                System.out.println("Linked list is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
        public static void main(String[] args) {
            deleteNthNodeFromEnd si = new deleteNthNodeFromEnd();
            si.addFirstMethod(18);
            si.addFirstMethod(1);
            si.addFirstMethod(71);
            si.addFirstMethod(19);
            si.addFirstMethod(321);
            si.addFirstMethod(81);
            si.addFirstMethod(110);
            si.printNode();
            si.delete(7);
            si.printNode();
    
        }
    }
    