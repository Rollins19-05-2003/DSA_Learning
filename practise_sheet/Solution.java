import java.util.*;

public class Solution {
    public int solution(int N, int[] A, int[] B) {
        List<Set<Integer>> graph = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            graph.add(new HashSet<>());
        }

        for (int i = 0; i < A.length; i++) {
            graph.get(A[i]).add(B[i]);
            graph.get(B[i]).add(A[i]);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] removed = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (graph.get(i).size() <= 1) {
                queue.offer(i);
                removed[i] = true;
            }
        }

        int seconds = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int vertex = queue.poll();

                for (int neighbor : graph.get(vertex)) {
                    if (!removed[neighbor]) {
                        graph.get(neighbor).remove(vertex);
                        if (graph.get(neighbor).size() == 1) {
                            queue.offer(neighbor);
                            removed[neighbor] = true;
                        }
                    }
                }
            }

            seconds++;

            // If all remaining vertices have degree > 1, stop
            boolean allRemaining = true;
            for (int i = 0; i < N; i++) {
                if (!removed[i] && graph.get(i).size() <= 1) {
                    allRemaining = false;
                    break;
                }
            }

            if (allRemaining) {
                break;
            }
        }

        return seconds;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int N1 = 7;
        int[] A1 = {0, 1, 2, 1, 4, 4};
        int[] B1 = {1, 2, 0, 4, 5, 6};
        System.out.println("Test Case 1: " + solution.solution(N1, A1, B1)); // Expected output: 2
        
        int N2 = 7;
        int[] A2 = {0, 1, 2, 4, 5};
        int[] B2 = {1, 2, 3, 5, 6};
        System.out.println("Test Case 2: " + solution.solution(N2, A2, B2)); // Expected output: 2
        
        int N3 = 4;
        int[] A3 = {0, 1, 2, 3};
        int[] B3 = {1, 2, 3, 0};
        System.out.println("Test Case 3: " + solution.solution(N3, A3, B3)); // Expected output: 0
        
        int N4 = 4;
        int[] A4 = {0, 1, 2};
        int[] B4 = {1, 2, 0};
        System.out.println("Test Case 4: " + solution.solution(N4, A4, B4)); // Expected output: 1
    }
}
