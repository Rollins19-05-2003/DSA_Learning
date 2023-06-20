package LinkedList1;

public class palindrome {
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
    
        // findMid
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;
            while (fast!=null && fast.next != null) {
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            return slow; 
        }

        // palindrome
        public boolean checkPalindrome(){
            if(head==null || head.next == null){
                return true;
            }

            //step 1 --> find mid
            Node midNode = findMid(head);

            // step 2 --> reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
    
            while (curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev; // right half head --> think 
            Node left = head;

            // step 3 --> check left half and right half
            while (right!=null) {
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        public static void main(String[] args) {
            palindrome si = new palindrome();
            palindrome si2 = new palindrome();
            si.addFirstMethod(110);
            si.addFirstMethod(321);
            si.addFirstMethod(19);
            si.addFirstMethod(321);
            si.addFirstMethod(110);
            si.printNode();
            System.out.println(si.checkPalindrome());

            si2.addFirstMethod(80);
            si2.addFirstMethod(50);
            si2.addFirstMethod(10);
            si2.addFirstMethod(20);
            si2.addFirstMethod(30);
            si2.printNode();
            System.out.println(si2.checkPalindrome());
    
        }
    }
    