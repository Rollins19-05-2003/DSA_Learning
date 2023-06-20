package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class usingCollectionsFramework {
    public static void main(String[] args) {
        Queue <Integer> q = new ArrayDeque<>();
        Queue <Integer> q1 = new LinkedList<>();
        q.add(12);
        q.add(15);
        q.add(16); 
        q.add(18);
        System.out.println(q.poll()+"----");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// This method differs from poll() only in that
// it throws an exception if this queue is empty.