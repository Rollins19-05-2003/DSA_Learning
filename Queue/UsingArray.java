package Queue;

public class UsingArray {

    static class queue {
        static int arr[];
        static int size;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int delete() {
            if (isEmpty()) {
                System.out.println("Element cannot be deleted");
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(16);
        q.add(17);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.delete();
        }
        q.add(997);
        System.out.println(q.isEmpty());
        q.delete();
    }

}