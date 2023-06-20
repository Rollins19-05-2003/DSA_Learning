package Queue;

public class circularQueueUsingArray {
    static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int delete() {
            if (isEmpty()) {
                System.out.println("Element cannot be deleted");
                return -1;
            }
            int result = arr[front];
            // if only 1 element is in the array and you have to delete that  then set both font = rear = -1;
            if (rear == front) {
                rear = front = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(12);
        q.add(13);
        q.add(14);
        System.out.println(q.delete());
        q.add(45);
        System.out.println(q.delete());
        q.add(5567);
        // System.out.println(q.isEmpty());
        // q.delete();
    }

}
